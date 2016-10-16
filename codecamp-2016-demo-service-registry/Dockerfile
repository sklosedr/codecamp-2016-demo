FROM anapsix/alpine-java:jre8

MAINTAINER sklose@next-level-intgegration.com

ADD target/codecamp-2016-demo-service-registry*.jar /codecamp-2016-demo-service-registry.jar
RUN sh -c 'touch /codecamp-2016-demo-service-registry.jar'

EXPOSE 8080

CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/codecamp-2016-demo-service-registry.jar"]
