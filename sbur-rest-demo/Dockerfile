FROM maven:3.9.4-jdk-11 as MAVEN_BUILD

WORKDIR /build

COPY pom.xml .

COPY src ./src


FROM openjdk:17

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} sbur-rest-demo-0.0.1-SNAPSHOT.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","/sbur-rest-demo-0.0.1-SNAPSHOT.jar"]
