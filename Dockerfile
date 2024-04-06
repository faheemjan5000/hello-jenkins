FROM openjdk:17
EXPOSE 8080
ADD target/hello-jenkins.jar hello-jenkins.jar
ENTRYPOINT ["java","-jar","/hello-jenkins.jar"]