package com.spring.ioc.main;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)  {
		Log msgLog = LogFactory.getLog(Main.class);
		ApplicationContext context =
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		int beanDefinitionCount = context.getBeanDefinitionCount();
		msgLog.info(String.format("spring ioc容器初始化完成，共创建了[{%d}]个对象实例",
				beanDefinitionCount));
	}
}
