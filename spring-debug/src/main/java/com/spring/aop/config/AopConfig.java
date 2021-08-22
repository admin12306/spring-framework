package com.spring.aop.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class AopConfig {

	@Pointcut("execution(* com.spring.aop.service..*.*(..))")
	public void point(){}

	@Before("point()")
	public void before(JoinPoint joinPoint){
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		Method method = methodSignature.getMethod();
		System.out.println("method before!");
	}

	@After("point()")
	public void after(){
		System.out.println("method after!");
	}

	@Around("point()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("环绕通知before");
		Object retVal = joinPoint.proceed();
		System.out.println("环绕通知after");
		return retVal;
	}

	@AfterReturning(value = "point()",returning = "retVal")
	public void afterReturing(JoinPoint joinPoint,Object retVal){
		System.out.println(String.format("返回后通知，其返回值 retVal=[%s]",retVal));
	}

	@AfterThrowing(value = "point()",throwing = "exception")
	public void afterThrowing(JoinPoint joinPoint,Exception exception){
		System.out.println(String.format("异常通知，e=%s",exception.getMessage()));
	}
}
