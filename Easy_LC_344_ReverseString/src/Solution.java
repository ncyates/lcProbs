/*
 * LeetCode 344
 * Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh". 
 */
public class Solution {

	public static void main(String[] args) {
		System.out.println(reverseString("hello"));
		

	}

	public static String reverseString(String s){
		return new StringBuilder(s).reverse().toString();
	}
}
