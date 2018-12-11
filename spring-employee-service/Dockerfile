FROM openjdk:jre-slim

LABEL maintainer="aurelius0523/kim.loong.tan"

ADD ./target/spring-employee-service-0.0.1-SNAPSHOT.war /

EXPOSE 8060

CMD ["java", "-jar", "spring-employee-service-0.0.1-SNAPSHOT.war"]