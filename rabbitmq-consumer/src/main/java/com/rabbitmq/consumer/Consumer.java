package com.rabbitmq.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Consumer {

	@RabbitListener(queues = "leo.message")
	public void subscribe(String message){
		log.info("start subscribe");
		log.info(message);
		log.info("end subscribe");
	}

}
