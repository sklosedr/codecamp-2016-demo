FROM node

MAINTAINER sklose@next-level-intgegration.com

ENV HOME=/usr/src/app
RUN mkdir $HOME
ADD src $HOME/src
ADD node_modules $HOME/node_modules
ADD angular-cli.json $HOME/angular-cli.json
ADD package.json $HOME/package.json
ADD tslint.json $HOME/tslint.json
WORKDIR $HOME

RUN ls -la $HOME

RUN npm install -g angular-cli

EXPOSE 4200
#EXPOSE 49153

#ENTRYPOINT ["/bin/bash"]
CMD [ "npm", "start" ]
