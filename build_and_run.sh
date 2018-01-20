#!/usr/bin/env bash
./mvnw clean install
docker image rm -f pablobastidas/microprofile || true
docker image build -t pablobastidas/microprofile .
docker container run --rm -ti --name=micro -p 8080:8080 pablobastidas/microprofile