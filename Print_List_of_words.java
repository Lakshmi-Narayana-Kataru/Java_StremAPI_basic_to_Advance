package com.learning.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Print_List_of_words {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("this", "is", "steams");
		words.stream().forEach(System.out::println);
	}

}
