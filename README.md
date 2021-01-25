# durango-event-streaming @ We Get IT

## Description
Durango is a simple project that shows capabilities of kafka event streaming.

## System requirements
 - JDK 11+
 - Maven 3.6.1+
 - Docker 19.03.12+

## Services
 - event-producer - 3 event producer instances that produces 10 events every 500 ms 
 - event-consumer - consumer instance processing events and logs every 100 received 

## Build tools and Docker
  - build maven project, docker images and run services ```docker_build_deploy.sh```