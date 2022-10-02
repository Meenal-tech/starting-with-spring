package com.spring.basics.springin5steps.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIn5StepsXmlContextApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(ClassPathXmlApplicationContext.class);
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("com.spring.basics.springin5steps.xml/applicationContext.xml");
		
		XmlPersonDao personDao = applicationContext.getBean(XmlPersonDao .class);
		
		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getXmlJdbcConnection());
		
		applicationContext.close();
		
	}
}
	