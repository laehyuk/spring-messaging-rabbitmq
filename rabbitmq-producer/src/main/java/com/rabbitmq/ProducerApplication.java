package com.rabbitmq;

import com.rabbitmq.enums.RoutingKey;
import com.rabbitmq.producer.MessageProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@Slf4j
@RequiredArgsConstructor
@SpringBootApplication
public class ProducerApplication {

	private final MessageProducer producer;

	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void publish() {
		log.info("publish message : {}", this);
		for(int i = 0 ; i < 100 ; i++){
			producer.publish(RoutingKey.TEST_MESSAGE, String.valueOf(i));
		}
		log.info("publication is over : {}", this);
	}

}
