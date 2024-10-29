package com.learning.stream;

import java.util.Arrays;
import java.util.List;

//import javax.print.attribute.IntegerSyntax;

public class Print_List_of_numbers_using_streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(12,23,34,45,67);
		
		numbers.stream().forEach(System.out::println);

	}

}
