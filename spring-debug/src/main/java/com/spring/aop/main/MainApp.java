package com.spring.aop.main;

import com.spring.aop.config.SpringAppConfig;
import com.spring.aop.service.TeacherService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SpringAppConfig.class);
		TeacherService teacherService = context.getBean(TeacherService.class);
		teacherService.add();
	}
}
