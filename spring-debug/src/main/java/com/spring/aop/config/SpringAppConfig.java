package com.spring.aop.config;

import com.spring.aop.domain.Persion;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@ComponentScan(basePackages = "com.spring.aop")
@EnableAspectJAutoProxy
@Import(Persion.class)
public class SpringAppConfig {
}
