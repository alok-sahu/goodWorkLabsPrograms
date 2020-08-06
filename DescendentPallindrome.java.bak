package com.goodWorkLabs.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DescendentPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number to check pallindrome or not");
		int number = scn.nextInt();
		pallindromeCheck(number);
	}

	private static void pallindromeCheck(int number) {
		Integer n = number;
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		String s = String.valueOf(number);
		if (s.length() % 2 == 0) {
			while (n != 0) {
				int digit = n % 10;
				n = n / 10;
				list1.add(digit);
			}
			for (int i = list1.size() - 1; i >= 0; i--) {
				list2.add(list1.get(i));
			}
			if (list1.equals(list2)) {
				System.out.println("Integer itself is a pallindrome");
			} else {
						 
			}
		} else {
			System.out.println("Only Even digits are allowed");
		}

	}

}
