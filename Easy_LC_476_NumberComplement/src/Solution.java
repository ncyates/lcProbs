/*
 * LeetCode 476
 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

Note:

    The given integer is guaranteed to fit within the range of a 32-bit signed integer.
    You could assume no leading zero bit in the integer’s binary representation.

Example 1:

Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.

Example 2:

Input: 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.

 */
public class Solution {

	public static void main(String[] args) {
		System.out.println(findComplement(5));
	}

	
	public static int findComplement(int num){
		
		System.out.println(Integer.toBinaryString(num));
		//int nolz = Integer.numberOfLeadingZeros(num);
		//System.out.println("Number of leading 0's is " +  nolz);
		//System.out.println("\n~num:\n\t" + Integer.toBinaryString(~num));
		//System.out.println("\n~num left shift 1:\n\t" + Integer.toBinaryString((~num)<<1));
		//System.out.println("\n~num neg 1:\n\t" + Integer.toBinaryString(-1*(~num)));
		//System.out.println("\n~num left shifted by " + nolz + ": " + Integer.toBinaryString(~num<<Integer.numberOfLeadingZeros(num)));
		//System.out.println(Integer.toBinaryString(Integer.reverse(num)));
		//Integer.par
		//num = num<<Integer.numberOfLeadingZeros(nolz);
		//System.out.println(Integer.toBinaryString(num));
		//num = ~num;
		//System.out.println(Integer.toBinaryString(~num));
		//num = num>>Integer.numberOfLeadingZeros(nolz);
		
		//num = (~num<<Integer.numberOfLeadingZeros(num))>>Integer.numberOfLeadingZeros(num);
		//System.out.println(Integer.parseInt(Integer.toBinaryString((~num<<Integer.numberOfLeadingZeros(num))>>Integer.numberOfLeadingZeros(num)),2));
		//System.out.println(Integer.toBinaryString(num));
		//num = num>>nolz;
		//System.out.println(Integer.toBinaryString(num));
		//System.out.println("num = " + Integer.toBinaryString(num));
		//System.out.println("~num = " + Integer.toBinaryString((~num)));
		//System.out.println("~num = " + Integer.toBinaryString((~num)<<29));
		//System.out.println(Integer.parseUnsignedInt(Integer.toBinaryString(~num), 2));

		//System.out.println(Integer.toBinaryString((int) (Math.pow(2, 31)))+1);

		//System.out.println(Integer.toBinaryString((int)(Math.pow(2, 31))));
		//String s = Integer.toBinaryString(Integer.reverse(num<<1));
		//System.out.println(s);
		//System.out.println(Integer.parseInt(s, 2));
		
		return Integer.parseInt(Integer.toBinaryString((~num<<Integer.numberOfLeadingZeros(num))>>Integer.numberOfLeadingZeros(num)),2);
		//return num;
		
	}
}
