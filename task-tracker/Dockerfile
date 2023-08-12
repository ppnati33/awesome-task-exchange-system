FROM openjdk:17
VOLUME /tmp
EXPOSE 8090
COPY build/libs/task-tracker-0.0.1-SNAPSHOT.jar task-tracker.jar
ENTRYPOINT ["java","-jar","/task-tracker.jar"]