package com.spring.ioc.config;

import com.spring.ioc.domain.ClassRoom;
import org.springframework.beans.factory.FactoryBean;

public class ClassRoomFactoryBean implements FactoryBean<Object> {
	@Override
	public Object getObject() throws Exception {
		return new ClassRoom();
	}

	@Override
	public Class<?> getObjectType() {
		return ClassRoom.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
