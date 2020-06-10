package com.Datastructure_Alogorithm.problems_solved;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) {
		
		char c = 'A'; //single charecter
		char c1 = 79; // ACII value
		char c2 = '\u0675'; //unicode
		char c3 = '\361'; //octale code
		char c4 = '\''; //octale code
		String str = "helo \\all\\";
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(str);
		
	}
	
	public static void changeCase() {
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
