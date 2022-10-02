package scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("scope")
@Configuration
public class SpringIn5StepsScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	// to log the stuff.
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext= 
				new AnnotationConfigApplicationContext(SpringIn5StepsScopeApplication.class);
		
		PersonDAO personDao = applicationContext.getBean(PersonDAO.class); 
		
		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class); 
		
		// what the LOGGER does is - it replaces whatever is inside "{}" with
		//personDao 
		
		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());
		
		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnection());
		
		applicationContext.close();

	}

}
