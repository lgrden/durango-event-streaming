#!/bin/bash
mvn clean install
docker build -t durango-event-consumer event-consumer
docker build -t durango-event-producer event-producer
docker-compose -f docker-compose-all.yaml up -d