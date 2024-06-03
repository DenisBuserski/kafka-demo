# Demo Kafka

### Description
This is a small project on how Kafka works. I am working on Windows 11, so the commands are bit different then the ones for [Linux](https://kafka.apache.org/quickstart). For Windows settings, you can follow this [video](https://www.youtube.com/watch?v=LX5LKBYHmyU). I have listed the needed commands below, just configure them with the destination of where you have extracted Kafka.

### Configuration
After you clone the repository, follow the commands below, by running them in different Windows PowerShell's in the directory where you have extracted Kafka.
```
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
```
```
.\bin\windows\kafka-server-start.bat .\config\server.properties
```
```
.\bin\windows\kafka-console-consumer.bat --topic demo-topic --from-beginning --bootstrap-server localhost:9092
```
After executing the last command, stay in the same PowerShell window to follow the messages we sent.

In the project there is a default message that will run, once you start it. For custom messages you can use the below endpoint:
```
POST http://localhost:8080/api/v1/messages
```
Example API:<br>
![example-api](example.png)

### Additional information
- [Kafka Tutorial - Core Concepts](https://www.youtube.com/watch?v=udnX21__SuU&list=PLN_xGGp_EzELV3J2Bp-kNkmI2Vor338NI&index=29&t=8s)
- [Apache Kafka in 6 minutes](https://www.youtube.com/watch?v=Ch5VhJzaoaI&list=PLN_xGGp_EzELV3J2Bp-kNkmI2Vor338NI&index=31)
- [Kafka Tutorial - Spring Boot Microservices](https://www.youtube.com/watch?v=SqVfCyfCJqw&t=637s)
