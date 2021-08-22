package com.spring.ioc.config;

import com.spring.ioc.domain.Grade;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;

import java.util.Objects;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		DefaultListableBeanFactory factory = (DefaultListableBeanFactory) beanFactory;
		// 生成BeanDefinition
		RootBeanDefinition beanDefinition = new RootBeanDefinition(Grade.class);
		// 生成BeanName
		String beanName = generateBeanName(beanDefinition);
		// 构建BeanDefinitionHolder
		BeanDefinitionHolder bdHolder = new BeanDefinitionHolder(beanDefinition,beanName);
		// 注册bean到容器中
		BeanDefinitionReaderUtils.registerBeanDefinition(bdHolder,factory);
	}

	private String generateBeanName(BeanDefinition beanDefinition){
		String beanClassName = beanDefinition.getBeanClassName();
		/*String[] beanNames = StringUtils.delimitedListToStringArray(beanClassName, ".");*/
		String beanName = ClassUtils.getShortName(beanClassName);
		if (Character.isLowerCase(beanName.charAt(0))){
			return beanName;
		}
		return Character.toLowerCase(beanName.charAt(0)) +
				beanName.substring(1);
	}
}
