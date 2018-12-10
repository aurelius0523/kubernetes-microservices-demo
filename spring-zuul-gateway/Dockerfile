FROM openjdk:jre-slim

LABEL maintainer="aurelius0523/kim.loong.tan"

ADD ./target/spring-zuul-gateway-0.0.1-SNAPSHOT.war /

EXPOSE 8080

CMD ["java", "-jar", "spring-zuul-gateway-0.0.1-SNAPSHOT.war"]