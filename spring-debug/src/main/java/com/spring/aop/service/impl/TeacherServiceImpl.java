package com.spring.aop.service.impl;

import com.spring.aop.service.TeacherService;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Override
	public void add() {
		System.out.println("test aop!");
	}
}
