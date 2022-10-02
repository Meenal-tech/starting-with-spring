package com.spring.basics.springin5steps;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)

// load the context

@ContextConfiguration(classes = SpringIn5StepsBasicApplication.class)

class BinarySearchTest {

	@Autowired
	BinarySearchImpl binarySearch;
	
	@Test
	void testScenario() {
		
		int result = binarySearch.binarySearch(new int[] {}, 0);
		
		assertEquals(result, 3);
	}

}
