# Demo Kafka

![kafka-logo](kafka-logo.jpg)

### Description
This is a small project on how Kafka works. I am working on Windows 11, so the commands are bit different then the 
ones for [Linux](https://kafka.apache.org/quickstart). For Windows settings, you can follow 
this [video](https://www.youtube.com/watch?v=LX5LKBYHmyU). I have listed the needed commands below, just configure 
them with the destination of where you have extracted Kafka.

<br>

### Configuration
After you clone the repository, follow the commands below, by running them in different Windows PowerShell's in the directory 
where you have extracted Kafka.

Start the Zookeeper:
```
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
```

Start the Kafka Broker:
```
.\bin\windows\kafka-server-start.bat .\config\server.properties
```

Start the Consumer:
```
.\bin\windows\kafka-console-consumer.bat --topic demo-topic --from-beginning --bootstrap-server localhost:9092
```
After executing the last command, stay in the same PowerShell window to follow the messages we sent. 

In the project there is a default message that will run, once you start it. For custom messages you can use the below endpoint:
```
POST http://localhost:8080/api/v1/messages
```
Example API:<br>
![example-api](example-api.png)

After you finish the demo you should stop all 3 command prompts(`Ctrl + C`) and delete the following folders: `logs`, `kafka-logs` 
and the content of `zookeeper`.

<br>

### Additional information





<br>

We can specify how many Clusters we want to create and how many Brokers we want in each Cluster. The number of Brokers 
in each Cluster does not have to be the same.
`Zookeeper` - Stores information about the Kafka cluster. Manages the Kafka cluster. When a new broker enters the cluster 
or a broker fails, ZooKeeper notifies the cluster. <br>

Each partition has one broker as the leader and the other brokers as followers.
Producers send messages to the partition leader, which then propagates the record to each replica
Partition Leader. Producers only send messages to the partition leader, and the leader then synchronizes with the other brokers. Consumers will also poll from the partition leader because the increasing consumer group’s offset has to be synchronized too.

![kafka-big-picture](kafka-big-picture.png)


The picture shows a cluster of 4 brokers providing a topic with 2 partitions and a replication factor of 3. When one partition 
leader crashes, Kafka chooses another broker as the new partition leader. Then, the consumers and producers also have to switch 
to the new leader.
![kafka-broker-leader](kafka-broker-leader.png)




- [Redpanda in a Nutshell](https://www.youtube.com/watch?v=hd9F1NqzVkY)
- [Demo: Redpanda Console (Open House 2022)](https://www.youtube.com/watch?v=ezDYSpC7JcU)
