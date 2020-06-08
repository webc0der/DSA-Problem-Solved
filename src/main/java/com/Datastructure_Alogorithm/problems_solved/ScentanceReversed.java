package com.Datastructure_Alogorithm.problems_solved;

import java.util.Scanner;

public class ScentanceReversed {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		
		
		String stringArr[] = inputString.split(" ");
		String outputString = "";
		char c = ' ';
		
		for(int i=stringArr.length-1 ; i>=0 ; i--) {
			if(i == stringArr.length-1 && (stringArr[i].charAt(0) >= 'a' && stringArr[i].charAt(0) <= 'z')) {
				String temp = "";
				for(int j=0 ; j<=stringArr[i].length()-1 ; j++) {
					if(j == 0)
						c = (char) (stringArr[i].charAt(j)-32);
					else
						c = stringArr[i].charAt(j);
					temp +=c; 
				}
				stringArr[i] = temp;
			}
			
			if(i == 0 && (stringArr[i].charAt(0) >= 'A' && stringArr[i].charAt(0) <= 'Z')) {
				String temp = "";
				for(int j=0 ; j<=stringArr[i].length()-1 ; j++) {
					if(j == 0)
						c = (char) (stringArr[i].charAt(j)+32);
					else
						c = stringArr[i].charAt(j);
					temp +=c; 
				}
				stringArr[i] = temp;
			}
			
			outputString= outputString+stringArr[i]+" ";
		}
		System.out.println(outputString);
		
		sc.close();
	}

}
