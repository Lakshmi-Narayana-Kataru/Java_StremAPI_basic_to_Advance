package com.learning.stream;

import java.util.stream.Stream;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.of("Hellow ", "world").forEach(System.out::print);

	}

}
