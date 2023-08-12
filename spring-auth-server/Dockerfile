FROM openjdk:17
VOLUME /tmp
EXPOSE 9000
COPY build/libs/spring-auth-server-0.0.1-SNAPSHOT.jar auth-server.jar
ENTRYPOINT ["java","-jar","/auth-server.jar"]