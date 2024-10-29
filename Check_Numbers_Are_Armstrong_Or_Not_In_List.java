package com.learning.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.print.attribute.IntegerSyntax;

public class Check_Numbers_Are_Armstrong_Or_Not_In_List {

	public static void main(String[] args) {
		System.out.print("Enter the range : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("THe list is Armstrong numbers from the range 0 to 500 are -> "+ ListOfArmstrongNumbers(size).size());
	}
	public static List<Integer> ListOfArmstrongNumbers(int num){
		
		List<Integer> list = new ArrayList<Integer>();
		
		list = IntStream.rangeClosed(0, num)
						.filter(i ->isArmstrong(i)).boxed()
						.collect(Collectors.toList());
		return list;
	}
	private static boolean isArmstrong(int num) {
		// TODO Auto-generated method stub
		return num == CheckArmstrog(num);
	}
	private static int CheckArmstrog(int num) {
		// TODO Auto-generated method stub
		int size = String.valueOf(num).length();
		int sum = IntStream.iterate(num, i -> i/10)
						.limit(size)
						.map(i-> (int)Math.pow(i%10, size))
						.sum();
		return sum;
	}

}
