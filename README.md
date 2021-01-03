> $ docker pull rabbitmq

> $ docker run -d --hostname rabbitmq --name leo-rabbit -p 5672:5672 -p 15672:15672 -e RABBITMQ_DEFAULT_USER=admin -e RABBITMQ_DEFAULT_PASS=1234 rabbitmq:management
