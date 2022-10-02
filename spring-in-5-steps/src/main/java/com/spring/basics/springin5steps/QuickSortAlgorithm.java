package com.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortingAlgorithm{

	public int sort(int[] numbers, int number) {
		return 1;
	} 
}
