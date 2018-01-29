FROM openjdk:8-alpine

MAINTAINER sjyuan <sjyuan@thoughtworks.com>

COPY build/libs/mst-goods-service-0.0.1-SNAPSHOT.jar /app/

WORKDIR /app

CMD java -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+PrintGCDateStamps -XX:+PrintHeapAtGC -verbose:gc -XX:+PrintTenuringDistribution -XX:+PrintGCApplicationStoppedTime -Xloggc:gc_cdm.log -jar mst-goods-service-0.0.1-SNAPSHOT.jar
