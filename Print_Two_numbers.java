package com.learning.stream;

import java.util.stream.Stream;

public class Print_Two_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10,b=20;
		Stream.of(a,b).forEach(System.out::println);

	}

}
