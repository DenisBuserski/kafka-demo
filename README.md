# Demo Kafka

.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

.\bin\windows\kafka-server-start.bat .\config\server.properties

.\bin\windows\kafka-console-consumer.bat --topic demo-topic --from-beginning --bootstrap-server localhost:9092

