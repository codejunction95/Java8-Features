package com.codejunction.java8.Java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionClass {

	public static void main(String[] args) {
		
		Function<Integer , Integer> addNoFive = x->x+5;
		
		System.out.println(addNoFive.apply(10));
		
		
		List<Integer> list = Arrays.asList(2,4,5,6);
		
		
		list.stream().map(addNoFive).forEach(System.out::println);
		
	}

}
