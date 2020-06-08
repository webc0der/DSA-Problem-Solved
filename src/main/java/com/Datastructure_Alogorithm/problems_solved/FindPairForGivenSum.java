package com.Datastructure_Alogorithm.problems_solved;

import java.util.Arrays;

public class FindPairForGivenSum {

	public static void main(String[] args) {

		int inputArray[] = {8, 7, 2, 5, 3, 1, 6, 4, 9, 5};

//		findIndexWithoutLibraryFunction(inputArray,10);
		findIndexWithLibraryFunction(inputArray,10);

	}

	private static void findIndexWithLibraryFunction(int[] inputArray, int sum) {
		for(int i = 0 ; i<=inputArray.length-1 ; i++) {
			if(inputArray[i] >= 5) {
				for(int j = (i == 0)? i+1 : 0 ; j<=inputArray.length-1 ; j++) {
					if(inputArray[(j == i) ? j++ : j] <= 5) 
						if(inputArray[i]+inputArray[j] == sum)
							System.out.println(inputArray[i]+" AND "+inputArray[j]+" GIVES THE SUM OF "+sum);
				}
			}
		}
	}

	private static void findIndexWithoutLibraryFunction(int[] inputArray, int sum) {
		Arrays.sort(inputArray);//[1,2,3,4,5,6,7,8,9]
		int lastIndex = inputArray.length-1;
		
		for(int i=0 ; i<=(inputArray.length-1)/2 ; i++) {
			System.out.print(inputArray[lastIndex]);
			if(inputArray[lastIndex--] + inputArray[i] == sum)
				System.out.println(" AND "+inputArray[i]+" GIVES THE SUM OF "+sum);
		}
	}
}
