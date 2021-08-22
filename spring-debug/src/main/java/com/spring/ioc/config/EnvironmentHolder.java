package com.spring.ioc.config;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

public class EnvironmentHolder implements EnvironmentAware {

	private Environment environment;

	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	/**
	 * 获取环境变量对象
	 * @return
	 */
	public ConfigurableEnvironment getEnvironment(){
		return (ConfigurableEnvironment) environment;
	}
}
