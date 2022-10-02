package com.spring.basics.springin5steps.componentScan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("componentScan")
public class SpringIn5StepsComponentApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentApplication.class);
	// to log the stuff.
	
	public static void main(String[] args) { 
		
		AnnotationConfigApplicationContext applicationContext=
				new AnnotationConfigApplicationContext(SpringIn5StepsComponentApplication.class);
		
		ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class); 
				
		// what the LOGGER does is - it replaces whatever is inside "{}" with
		//personDao 
		
		LOGGER.info("{}", componentDao);
		LOGGER.info("{}", componentDao.getJdbcConnection());

		applicationContext.close();

	}

}
