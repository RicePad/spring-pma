FROM ubuntu:latest

MAINTAINER Your Name "jonali.me"

RUN apt-get update && apt-get install -y openjdk-8-jdk

ENV version=aws-db-usage

ENV dbuser=postgres
ENV dbpass=password321
ENV jdbcurl=jdbc:postgresql://pmadatabaseaws.cngquqqjuc9v.us-east-1.rds.amazonaws.com:5432/postgres

WORKDIR /usr/local/bin/

ADD target/pma-app.jar .

# CMD ["/bin/bash"]

ENTRYPOINT ["java", "-jar", "pma-app.jar"]1