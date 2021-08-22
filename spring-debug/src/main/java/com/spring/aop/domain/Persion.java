package com.spring.aop.domain;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Persion {

	private final Log msgLog = LogFactory.getLog(getClass());
	public void printName(){
		msgLog.info("import 实现类注册到spring ioc容器中");
	}
}
