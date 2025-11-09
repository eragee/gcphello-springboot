FROM eclipse-temurin:17-jre
WORKDIR /app
COPY target/gcphello-1.0.0-RELEASE.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
