package com.codejunction.java8.Java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class PredicateClass {

	
	public static void main(String[] args) {
		
		Predicate<Integer> noGreaterThanFive = x->x>5;
		
		System.out.println(noGreaterThanFive.test(8));
		
		List<Integer> list = Arrays.asList(1,2,5,6,7,8);
		
		List<Integer> secodList = list.stream().filter(n->n>5)
				.collect(Collectors.toList());
		
		System.out.println(secodList);
		
	}
}
