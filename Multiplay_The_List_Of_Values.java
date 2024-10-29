package com.learning.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Multiplay_The_List_Of_Values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(2,2,8);
		
		int output = numbers.stream().mapToInt(Integer::intValue).reduce(1, (a,b) -> a*b);
		
		System.out.println(output);
	}

}
