FROM amazoncorretto:21-alpine
COPY devops-java.jar /usr/local/devops-java.jar
WORKDIR /usr/local
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "devops-java.jar"]

