package com.rabbitmq.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum RoutingKey {

	TEST_MESSAGE("","leo.message");

	private final String exchange;
	private final String routingKey;

}
