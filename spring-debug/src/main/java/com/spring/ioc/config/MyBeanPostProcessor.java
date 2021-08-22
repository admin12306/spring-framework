package com.spring.ioc.config;

import com.spring.ioc.domain.Grade;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
	// 日子打印
	private final Log msgLog = LogFactory.getLog(getClass());

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof Grade){
			msgLog.info("===前置处理器=====");
		}

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof Grade){
			msgLog.info("====后置处理器=====");
		}
		return bean;
	}
}
