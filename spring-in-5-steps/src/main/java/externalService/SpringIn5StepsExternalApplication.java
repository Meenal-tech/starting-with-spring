package externalService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath: app.properties")
public class SpringIn5StepsExternalApplication {


	private static Logger LOGGER = LoggerFactory.
			getLogger(SpringIn5StepsExternalApplication.class);
	
	public static void main(String[] args) {
		
	
		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsExternalApplication.class);
			
		SomeExternalService externalService = 
				applicationContext.getBean(SomeExternalService.class);
		
		LOGGER.info("{}", externalService.returnUrlService());
		
		
		
		applicationContext.close();
		
	}

}
