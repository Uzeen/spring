FROM tomcat:8.0
LABEL Name:NonuSingh
ADD **/*SNAPSHOT.war /usr/local/tomcat/webapps
CMD ["catalina.sh", "run"]