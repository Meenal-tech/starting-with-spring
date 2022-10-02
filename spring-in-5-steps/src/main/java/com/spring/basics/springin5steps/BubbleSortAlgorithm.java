package com.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortingAlgorithm{

	public int sort(int[] numbers, int number) {
		// some logic
		return 2;
	}

}
