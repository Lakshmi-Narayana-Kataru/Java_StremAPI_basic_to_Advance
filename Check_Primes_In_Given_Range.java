package com.learning.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Check_Primes_In_Given_Range {

	public static void main(String[] args) {
		System.out.print("Enter the number range : ");
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		System.out.println("The list of Prime numbers from the range 1 to "+n+" is :"+ListOfPrimes(n));

	}

	private static List<Integer> ListOfPrimes(int n) {
		List<Integer> prime = new ArrayList<Integer>();
		prime = IntStream.rangeClosed(2, n)
				.filter(i -> IsPrime(i)).boxed()
				.collect(Collectors.toList());
		return prime;
	}

	private static boolean IsPrime(int num) {
		// TODO Auto-generated method stub
		boolean isprime = IntStream.range(2,num-1)
								   .noneMatch(i -> num%i==0);
		return isprime;
	}

}
