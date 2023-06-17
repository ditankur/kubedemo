FROM openjdk:17
EXPOSE 8080
ADD target/kubedemo-spring-app-v1.jar kubedemo-spring-app-v1.jar
ENTRYPOINT ["java","-jar","/kubedemo-spring-app-v1.jar"]