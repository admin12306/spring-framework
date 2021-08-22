package com.spring.ioc.domain;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ClassRoom {
	private final Log msgLog = LogFactory.getLog(getClass());
	private int name;
	private int stuNum;

	public int getName() {
		return name;
	}

	public void print(){
		msgLog.info("教室执行方法");
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getStuNum() {
		return stuNum;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
}
