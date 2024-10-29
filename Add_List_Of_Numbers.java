package com.learning.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Add_List_Of_Numbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(23,43,56,65);
//		int output =numbers.stream().reduce(0,(a,b) -> a+b);
//		System.out.println(output);
		int output = numbers.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println(output);
	}

}
