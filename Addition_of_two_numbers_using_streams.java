package com.learning.stream;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Addition_of_two_numbers_using_streams {
	public static void main(String[] args) {
		int a =10;
		int b=23;
//		OptionalInt sum =IntStream.of(a,b).reduce((n1,n2)->n1+n2);
//		System.out.println(sum);
		
		int sum =IntStream.of(a,b).sum();
		System.out.println(sum);
	}

}
