## Description

Three different projects in order to reproduce a problem with Spring Cloud HeartbeatEvent when Spring Cloud Config Discovery is enabled.

## Requirements
Download Consul client from https://www.consul.io/downloads.html

For the Config Server:

`$ cd /tmp/`

`$ mkdir git-config`

`$ cd git-config`

`$ touch application.yml`

`$ git init`

`$ git add application.yml`

`$ git commit -m "Initial Commit"`

## Running Consul as dev
`$ cd CONSUL_DIR`

`$ ./consul agent -dev`

## Running the app
1. First run the Application class of the config-server.
1. Run the Application class of the spring-cloud-config-discovery-noheartbeat
1. Run the Application class of the spring-cloud-config-heartbeat

## Expected Results
In the spring-cloud-config-heartbeat application, an entry in the log will appear:

`2019-01-17 11:52:37.756  INFO 21490 --- [TaskScheduler-1] com.example.demo.HearbeatEventListener   : HeartbeatEvent:560`

In the spring-cloud-config-discovery-noheartbeat application there will be no entry in the log about the heartbeat.

Both applications are the same with the only difference that spring-cloud-config-discovery-noheartbeat has the property spring.cloud.config.discovery.enabled=true
