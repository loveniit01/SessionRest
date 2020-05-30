FROM java:8
#EXPOSE 10222 
#ADD ./target/SessionRest-0.0.1-SNAPSHOT.jar SessionRest-0.0.1-SNAPSHOT.jar 
#ENTRYPOINT ["java","-jar","SessionRest-0.0.1-SNAPSHOT.jar"]

#FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
