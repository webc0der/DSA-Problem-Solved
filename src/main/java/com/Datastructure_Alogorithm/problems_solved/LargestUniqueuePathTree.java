package com.Datastructure_Alogorithm.problems_solved;

import java.util.HashMap;

public class LargestUniqueuePathTree {

	static class Tree { 
		int x; 
		Tree l, r; 
	};

	static Tree newNode(int data) 
	{ 
		Tree temp = new Tree(); 
		temp.x = data; 
		temp.l = temp.r = null; 
		return temp; 
	} 

	public static void main(String[] args) {

	}

	static int distinctPath(Tree T) 
	{ 
		if (T == null) 
			return 0; 

		HashMap<Integer, 
		Integer> hash = new HashMap<Integer, 
		Integer>(); 

		return distinctPathUtil(T, hash); 
	} 

	static int distinctPathUtil(Tree node, HashMap<Integer, Integer> m) { 
		if (node == null) 
			return m.size(); 

		if(m.containsKey(node.x)) 
		{ 
			m.put(node.x, m.get(node.x) + 1); 
		} 
		else
		{ 
			m.put(node.x, 1); 
		} 

		int paths = Math.max(distinctPathUtil(node.l, m), 
				distinctPathUtil(node.r, m)); 

		if(m.containsKey(node.x)) 
		{ 
			m.put(node.x, m.get(node.x) - 1); 
		} 

		if (m.get(node.x) == 0) 
			m.remove(node.x); 

		return paths; 
	} 
}
