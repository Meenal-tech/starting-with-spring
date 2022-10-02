package com.spring.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsBasicApplication {

//	 here we have 1 bean, since we are creating 1 instance of the 
	// BinarySearchImpl class.
	// but we have dependency on Bubble and Quick sore algorithm classes.
	
	public static void main(String[] args) {
		
		int [] numbers = {1, 5, 6, 8, 5};
	
		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);
			
		BinarySearchImpl binarySearch = applicationContext
				.getBean(BinarySearchImpl.class);
		
		int res = binarySearch.binarySearch(numbers, 0);
	
		System.out.println(res);		
		
//		BinarySearchImpl binarySearch = 
//				new BinarySearchImpl(numbers, 
//						new QuickSortAlgorithm());
		
//		 commenting above code, since now Spring would be managing the dependencies
//		and the beans etc.		
		
		applicationContext.close();
		
	}

}
