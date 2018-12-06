FROM openjdk:8
ADD target/rest-docker-demo.jar rest-docker-demo.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "rest-docker-demo.jar"]
