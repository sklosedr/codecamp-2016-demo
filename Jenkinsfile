node('build-slave') {

    // Project name will be passed in as a parameter
    def project = "${GCP_PROJECT_NAME}"
    def appName = 'ccdemo'

    // BUILD_DATE_TIME defined as a build parameter in Jenkins
    def imageTag = "eu.gcr.io/${project}/${appName}:${BUILD_DATE_TIME}"

    // Mark the code checkout 'stage'....
    stage 'Checkout'

    // Checkout the code
    checkout scm

    // Mark the code build 'stage'....
    stage 'Compile'
    // Run the maven build
    sh "mvn clean compile"

    // Test and Package
    stage 'Test and Package'
    sh "mvn package"

    stage 'Bake Docker Image'
    sh("docker build -t ${imageTag}-sr codecamp-2016-demo-service-registry")
    sh("docker build -t ${imageTag}-ds codecamp-2016-demo-dog-service")
    sh("docker build -t ${imageTag}-bweb codecamp-2016-demo-webapp/codecamp-2016-demo-backend-webapp")
    // sh("docker build -t ${imageTag}-fweb codecamp-2016-demo-webapp/codecamp-2016-demo-frontend-webapp")

    stage 'Push images to GCR'
    sh("gcloud auth activate-service-account --key-file /opt/config/gcloud-svc-account.json")
    sh("gcloud config set project ${project}")
    sh("gcloud docker push ${imageTag}-sr")
    sh("gcloud docker push ${imageTag}-ds")
    sh("gcloud docker push ${imageTag}-bweb")
    // sh("gcloud docker push ${imageTag}-fweb")

    stage 'Deploy latest version'
    sh("sed -i.bak 's#eu.gcr.io/GCP_PROJECT/APP_NAME:1.0.0#${imageTag}#' k8s.deployments/app-deployment.yaml")
    sh("kubectl apply -f k8s.deployments/app-deployment.yaml")
    sh("kubectl apply -f k8s.services/app-service.yaml")

    stage 'Extract service IP address'
    // Execute and wait for external service to become available
    sh("echo 'kubectl get services'")
    // Read output from script above
//    def FRONTEND_ADDRESS=readFile('frontend_service_address').trim()

    stage 'Output service external address'
    sh("echo 'kubectl get services'")
}
