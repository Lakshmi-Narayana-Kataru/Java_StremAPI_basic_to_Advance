package com.learning.stream;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Armstrong_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean armstrong = isArmstrong(num);
		if(armstrong)
			System.out.println(num+" is armstrong number");
		else
			System.out.println(num+" is an not a armstrong number");
		
	}

	private static boolean isArmstrong(int num) {
		int limit = String.valueOf(num).length();
		int sum = IntStream.iterate(num, i->i/10)
						.limit(limit)
						.map(i-> (int)Math.pow(i%10, limit))
						.sum();
		return sum==num;
	}

}
