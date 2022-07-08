FROM openjdk:18.0.1
EXPOSE 8080
ADD target/dockerdemo.jar dockerdemo.jar
ENTRYPOINT ["java","-jar","/dockerdemo.jar"]