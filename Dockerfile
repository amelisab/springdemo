
FROM openjdk:8-jdk


ARG JAR_FILE=target/springdemo2-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} springdemo2-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "springdemo2-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080




FROM mysql

ENV MYSQL_DATABASE courses

COPY target/create-db.sql /docker-entrypoint-initdb.d/



# # Derived from official mysql image (our base image)
# FROM mysql
# # Add a database
# ENV MYSQL_DATABASE company
# # Add the content of the sql-scripts/ directory to your image
# # All scripts in docker-entrypoint-initdb.d/ are automatically
# # executed during container startup
# COPY ./sql-scripts/ /docker-entrypoint-initdb.d/
