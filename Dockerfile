FROM tomcat:9.0
LABEL "name"="NonuSingh"
ADD *SNAPSHOT.war /usr/local/tomcat/webapps
CMD ["catalina.sh", "run"]