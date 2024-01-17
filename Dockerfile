FROM openjdk:11
ADD /target/PastebinLike-0.0.1-SNAPSHOT.jar /PastebinLike.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "PastebinLike.jar"]