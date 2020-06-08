package com.Datastructure_Alogorithm.problems_solved;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		String str = "Abc";
		String result="";
		char c=' ';
		for(int i = 0; i <= str.length()-1; i++) {
			
			if(str.charAt(i) == 'A') {
				c = (char) (str.charAt(i)+32);
			}
			else {
				c = str.charAt(i);
			}
			result +=c;	
		}
		System.out.println(result);
	}
}
