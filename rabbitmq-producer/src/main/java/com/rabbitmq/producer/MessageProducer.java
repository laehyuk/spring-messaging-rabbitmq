package com.rabbitmq.producer;

import com.rabbitmq.enums.RoutingKey;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageProducer {

	private final RabbitTemplate rabbitTemplate;

	public void publish(RoutingKey routingKey, String message){
		rabbitTemplate.convertAndSend(routingKey.getRoutingKey(), message);
	}

}
