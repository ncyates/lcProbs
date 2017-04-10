/*LeetCode 412
 * Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.

Example:

n = 15,

Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]

 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// fizzBuzz(15);
		// fizzBuzz2(15);
		// fizzBuzz3(15);
		fizzBuzz5(15);
	}

	// public List<String> fizzBuzz(int n) {
	public static void fizzBuzz(int n) {
		String fizz = "Fizz";
		String buzz = "Buzz";
		for (int i = 1; i <= n; i++) {
			// System.out.println(Integer.toString(i));
			if (i % 3 != 0 && i % 5 != 0) {
				System.out.print(Integer.toString(i));
			} else if (i % 3 == 0) {
				System.out.print(fizz);
			}
			if ((i) % 5 == 0) {
				System.out.print(buzz);
			}
			System.out.println();
		}
	}

	public static List<String> fizzBuzz2(int n) {

		List<String> res = new ArrayList<String>();

		String s;
		for (int i = 1; i <= n; i++) {
			if (i % 3 != 0 && i % 5 != 0) {
				res.add(Integer.toString(i));
				continue;
			}
			s = "";
			if (i % 3 == 0) {
				s += "Fizz";
			}
			if (i % 5 == 0) {
				s += "Buzz";
			}
			res.add(s);
		}
		return res;
	}

	public static List<String> fizzBuzz3(int n) {
		LinkedList<String> res = new LinkedList<String>();
		for (int i = n; i > 0; i--) {
			if (i % 5 == 0) {
				if (i % 3 == 0) {
					res.addFirst("FizzBuzz");
				} else {
					res.addFirst("Buzz");
				}
			} else if (i % 3 == 0) {
				res.addFirst("Fizz");
			} else {
				res.addFirst(Integer.toString(i));
			}
		}
		return res;
	}

	public static List<String> fizzBuzz4(int n) {
		List<String> ret = new ArrayList<String>(n);
		for (int i = 1, fizz = 0, buzz = 0; i <= n; i++) {
			fizz++;
			buzz++;
			if (fizz == 3 && buzz == 5) {
				ret.add("FizzBuzz");
				fizz = 0;
				buzz = 0;
			} else if (fizz == 3) {
				ret.add("Fizz");
				fizz = 0;
			} else if (buzz == 5) {
				ret.add("Buzz");
				buzz = 0;
			} else {
				ret.add(String.valueOf(i));
			}
		}
		return ret;
	}

	public static List<String> fizzBuzz5(int n) {

		LinkedList<String> res = new LinkedList<String>();
		for (int i = n,  fizz = n%3, buzz = n%5; i > 0; i--) {
			if (buzz == 0) {
				if (fizz == 0) {
					res.addFirst("FizzBuzz");
					fizz = 3;
				} else {
					res.addFirst("Buzz");
				}
				buzz = 5;
			} else if (fizz == 0) {
				res.addFirst("Fizz");
				fizz = 3;
			} else {
				res.addFirst(Integer.toString(i));
				System.out.println();
			}
			fizz--;
			buzz--;
			System.out.println();
		}

		for (int i = 0; i < res.size(); i++) {
			System.out.println(res.get(i));
		}

		return res;
	}



}
