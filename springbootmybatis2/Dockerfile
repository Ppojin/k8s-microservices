FROM openjdk:8-jre-alpine
ENV APP_FILE springbootmybatis2-0.0.1-SNAPSHOT.jar
EXPOSE 9999
COPY target/$APP_FILE sample-post.jar
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar sample-post.jar"]