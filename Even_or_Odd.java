package com.learning.stream;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Even_or_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int a =sc.nextInt();
		if(IntStream.of(a).anyMatch(n->n%2==0)) {
			System.out.println(a+" is Even number");
		}
		else {
			System.out.println(a+" is Odd number");
		}

	}

}
