#Base Image
#Install JRE/JDK

#Copy Jar file
#Start App

FROM openjdk:8-jdk-alpine
MAINTAINER nayak.bishwa@gmail.com
#WORKDIR
COPY ./target/*.jar app.jar
ENV SERVER_PORT 9898
#EXPORTS JAVA_OPTS --server.port=${SERVER_PORT}
ENTRYPOINT ["java","-jar","--server.port =${SERVER_PORT}","app.jar"]
EXPOSE 8080