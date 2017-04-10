/*
 * LeetCode 344
 * Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh". 
 */

//import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) {

		String s1 = "Racecar Boob Tatat";
		System.out.println(reverseWords(s1) + ".");
		System.out.println(reverseWords1(s1) + ".");
		System.out.println(reverseWords2(s1) + ".");
	}

	// abcd efgh ijkl
	// lkji hgfe dcba
	// dcba hgfe lkji

	public static String reverseWords(String s) {

		// Returns whole string reversed, not each word reversed
		// return new StringBuilder(s).reverse().toString();

		// StringTokenizer st = new StringTokenizer(s);
		// while (st.hasMoreTokens()){
		// res += new StringBuilder(st.nextToken()).reverse().toString();
		// }

		String[] splitString = s.split(" ");
		String res = "";
		for (int i = 0; i < splitString.length - 1; i++) {
			String temp = new StringBuilder(splitString[i]).reverse().toString();
			res += temp + " ";
		}
		res += new StringBuilder(splitString[splitString.length - 1]).reverse().toString();

		return res;
	}

	public static String reverseWords1(String s) {

		String[] splitString = s.split(" ");

		String res = new StringBuilder(splitString[0]).reverse().toString();

		for (int i = 1; i < splitString.length; i++) {
			if (i < splitString.length) {
				res += " ";
			}
			res += new StringBuilder(splitString[i]).reverse().toString();
		}

		return res;
	}

	public static String reverseWords2(String s) {
		String res = "";
		String[] revSplit = new StringBuilder(s).reverse().toString().split(" ");
		for (int i = revSplit.length - 1; i > 0; i--) {
			res += revSplit[i] + " ";
		}
		return res + revSplit[0];
	}

}
