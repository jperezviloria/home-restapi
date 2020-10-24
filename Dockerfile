FROM openjdk:8-jre
EXPOSE 8080
COPY /target/*.jar /usr/local/tomcat/webapps/app.js
RUN sh -c 'touch /usr/local/tomcat/webapps/home2.jar'
ENTRYPOINT ["sh", "-c", "-jar /usr/local/tomcat/webapps/home2.js"]