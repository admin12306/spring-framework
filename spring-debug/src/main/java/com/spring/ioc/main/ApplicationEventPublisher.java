package com.spring.ioc.main;

import com.spring.ioc.config.EventPublisherHolder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationEventPublisher {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("ApplicationContext.xml");

		EventPublisherHolder publisherHolder = context.getBean(EventPublisherHolder.class);
		System.out.println(publisherHolder);

	}
}
