package com.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	// adding below "@Autowired", since "BinarySearchImpl" has a dependency on "SortingAlgorithm".
	

	@Autowired
	@Qualifier("bubble")
	SortingAlgorithm sorting;
	
	// it is optional to use constructor for initializing the instance of SortingAlgorithm.
	// we can even use setter method to do so, and even if we don't use any of these two,
	// @Autowired alone can handle injecting all the dependencies
	
	private static Logger LOGGER = LoggerFactory.getLogger(BinarySearchImpl.class);  
	
	public void setSorting(SortingAlgorithm sorting) {
		this.sorting = sorting;
	}

	public int binarySearch(int [] numbers, int number) {
		
		return sorting.sort(numbers, number);
		
	}
//	
//	@PreDestroy
//	public void preConstruct() {
//		LOGGER.info("pre destroy");
//	}
//	
//	@PostConstruct
//	public void postConstruct() {
//		LOGGER.info("post construct");
//	}
	
}
