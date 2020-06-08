package com.Datastructure_Alogorithm.problems_solved;

import java.util.HashMap;
import java.util.Map;

public class GameOfCrads {

	static final Map<String, Integer> CARD_HIERARCHY = new HashMap<String, Integer>(){{
        put("A", 12);
        put("K", 12);
        put("Q", 11);
        put("J", 10);
        put("T", 9);
        put("9", 8);
        put("8", 7);
        put("7", 6);
        put("6", 5);
        put("5", 4);
        put("4", 3);
        put("3", 2);
        put("2", 1);
    }};
	
	public static void main(String[] args) {
		System.out.println(solution("A586QK","JJ653K"));
	}
	
	public static int solution(String A, String B) {
		int numAWins = 0;
		
		if (A != null && B != null && A.length() == B.length()) {
			
			for (int i = 0; i < A.length(); i++) {
				
				Integer aCradValue = CARD_HIERARCHY.get(String.valueOf(A.charAt(i)));
				Integer bCardValue = CARD_HIERARCHY.get(String.valueOf(B.charAt(i)));
				
				if ((aCradValue != null && bCardValue != null)&& aCradValue.intValue() > bCardValue.intValue()) numAWins++;
			}
		}
		
		return numAWins;
	}
}
















