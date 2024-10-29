package com.learning.stream;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Check_the_person_is_eligible_for_Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the Age of the person :");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		boolean eligible =IntStream.of(age).anyMatch(n -> n>=18);
		if(eligible)
			System.out.println("eligibel");
		else
			System.out.println("Not eligible");

	}

}
