FROM openjdk:jre-slim

LABEL maintainer="aurelius0523/kim.loong.tan"

ADD ./target/spring-payroll-service-0.0.1-SNAPSHOT.war /

EXPOSE 8060

CMD ["java", "-jar", "spring-payroll-service-0.0.1-SNAPSHOT.war"]