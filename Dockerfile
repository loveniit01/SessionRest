FROM java:8
EXPOSE 10222 
ADD ./target/SessionRest-0.0.1-SNAPSHOT.jar SessionRest-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-jar","SessionRest-0.0.1-SNAPSHOT.jar"]
