package com.learning.stream;

import java.util.stream.IntStream;

public class Check_Prime_Using_Streams {

	public static void main(String[] args) {
		
		int num =3;
		boolean isprime = IntStream.range(2,num-1).noneMatch(i -> num%i==0);
		if(isprime) {
			System.out.println(num+" is a prime number");
		}
		else {
			System.out.println(num+" is not a prime number");
		}

	}

	

}
