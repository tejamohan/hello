FROM openjdk:8-jdk-alpine
COPY target/springboot.jar springboot.jar
ENTRYPOINT ["java","-jar","/springboot.jar"]