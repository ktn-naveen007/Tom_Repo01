FROM 9.0.24-jdk8-openjdk-slim

MAINTAINER Naveen

RUN apt-get update && apt-get -y upgrade

WORKDIR /usr/local/tomcat

COPY target/*.war /usr/local/tomcat/webapps/app.war

EXPOSE 8080
