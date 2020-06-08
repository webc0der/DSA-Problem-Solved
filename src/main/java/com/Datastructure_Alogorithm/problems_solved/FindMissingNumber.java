package com.Datastructure_Alogorithm.problems_solved;

import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {

		int[] input = { 1,5,3,4,5,7,8,9,8,7,6,5,6,7 };

		int[] register = new int[input.length];
		
		for (int i : input) { 
			System.out.println("i: "+i);
			System.out.println("register[i]: "+register[i]);
			register[i] = 1; 
			}
		System.out.println(Arrays.toString(register));
		System.out.println("missing numbers in given array");
		
		for (int i = 1; i < register.length; i++) { 
			if (register[i] == 0) System.out.println(i);
		}

	}

}
