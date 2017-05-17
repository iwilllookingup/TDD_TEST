## dmpss-jmslistener
#

### Purpose of this project 
 * This project create for receive response message from OMX by JMS and pass interested result 
   to Redis and Gearman ,then wait for php side to get results and do next operation .


### Application Environment

**Explaination** : You can overide usage environment variable follow tables below.
**Note** : If you want to overide config in properti file you can do it directly through /src/main/resources/config/application.properties path. 

```bash
Application Log Config

|           Name          |                 Description                 |                             Example                              |
|-------------------------|---------------------------------------------|------------------------------------------------------------------|
| XPLSS_REST_URL          | The URL used for request to swagger.        | XPLSS_REST_URL=http://dmp-apigw-rs.vcs.true.th/dmpapplogs/v1/log |
| XPLSS_REST_SERVICENAME  | 			                        | XPLSS_REST_SERVICENAME=DMP                                       |
| XPLSS_REST_PACKAGENAME  |                                             | XPLSS_REST_PACKAGENAME=n/a                                       |
| XPLSS_REST_SOURCESYSTEM | Source that create request.                 | XPLSS_REST_SOURCESYSTEM=OMX                                      |
| XPLSS_REST_OURSYSTEM    | System that accept request.                 | XPLSS_REST_OURSYSTEM=dp-jms-listener                             |
| XPLSS_REST_OURFUNCTION  | API that get request for do some operation. | XPLSS_REST_OURFUNCTION=dp-jms-listener                           |
```


```bash
System Log Config

|           Name                  |                Description          |                Example                  |
|---------------------------------|-------------------------------------|-----------------------------------------|
| XPLSS_REDIS_HOSTREDISLOG        | Host IP for Redis server.           | XPLSS_REDIS_HOSTREDISLOG=172.19.208.43  |
| XPLSS_REDIS_PORTREDISLOG        | Port for Redis server.              | XPLSS_REDIS_PORTREDISLOG=6379           |
| XPLSS_REDIS_ERRORLISTKEY        | Key for Redis when operation error. | XPLSS_REDIS_ERRORLISTKEY=OMXErrorLog    |
| XPLSS_REDIS_OMXMESSAGEEXPIEDAYS | Expried date number of Redis.       | XPLSS_REDIS_OMXMESSAGEEXPIEDAYS=100     |
| XPLSS_REDIS_OMXMESSAGEKEYPREFIX | Prefix word for Redis key.          | XPLSS_REDIS_OMXMESSAGEKEYPREFIX=OMXlog: |
| XPLSS_REDIS_OMXMESSAGEKEYSUFFIX | Suffix word for Redis key.          | XPLSS_REDIS_OMXMESSAGEKEYSUFFIX=.log    |
```


```bash
Gearman Config

|           Name            |          Description        |                 Example                 |
|---------------------------|-----------------------------|-----------------------------------------|
| XPLSS_GEARMAN_GEARMANHOST | Host ip for Gearman server. | XPLSS_GEARMAN_GEARMANHOST=172.19.208.43 |
| XPLSS_GEARMAN_GEARMANPORT | Port for Gearman server.    | XPLSS_GEARMAN_GEARMANPORT=4730          |
```


```bash
Gearman Service Config

|           Name                 |                         Description                          |                 Example                    |
|--------------------------------|--------------------------------------------------------------|--------------------------------------------|
| XPLSS_GEARMANSERVICE_BACKUPDIR | Backup directory for keep results when cannot keep in Redis. | XPLSS_GEARMANSERVICE_BACKUPDIR=C:/redisLog |
| XPLSS_GEARMANSERVICE_QUEUENAME | Queue name of gearman job.                                   | XPLSS_GEARMANSERVICE_QUEUENAME=JMS_Queue   |
```


```bash
OMX JMS Result Config

|           Name        |                Description               |                              Example                                  |
|-----------------------|------------------------------------------|-----------------------------------------------------------------------|
| XPLSS_JMS_URL         | URL for JMS server.                      | XPLSS_JMS_URL=tcp://172.19.211.101:7222                               |
| XPLSS_JMS_USER        | User for JMS serve                       | XPLSS_JMS_USER=Notification                                           |
| XPLSS_JMS_PASSWORD    | Password for JMS server.                 | XPLSS_JMS_PASSWORD=OMXNotification                                    |
| XPLSS_JMS_FACTORYNAME | JNDI name.                               | XPLSS_JMS_FACTORYNAME=TopicConnectionFactory                          |
| XPLSS_JMS_DURABLENAME | The name for the durable subscription.   | XPLSS_JMS_DURABLENAME=UAT_SET05.DP_XPLSS                              |
| XPLSS_JMS_TOPIC       | Topic that we subscribed.                | XPLSS_JMS_TOPIC=UAT_SET05.true.omx.external.order.status.notification |
| XPLSS_JMS_CHANNEL     | Expression of JMS message.               | XPLSS_JMS_CHANNEL=DP_XPLSS                                            |
| XPLSS_JMS_ISDURABLE   | State of durable , can be true or false. | XPLSS_JMS_ISDURABLE=true                                              |

NOTE : By default XPLSS_JMS_ISDURABLE should be "true" for recieve outstanding message in JMS .     
```


###KEYWORD
 * **JMS TOPIC** : A distribution mechanism for publishing messages that are delivered to multiple subscribers.
 * **Durable** : Message will be saved both on-disk and in-memory and sent later if subscriber is inactive.
