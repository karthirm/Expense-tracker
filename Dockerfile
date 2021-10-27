FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 8090
ARG JAR_FILE=target/expense-tracker-rest-api-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]