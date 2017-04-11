import java.util.HashSet;
import java.util.Iterator;

/*
 * LeetCode 136
 * Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory? 
 */
public class Solution {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 1, 2, 3, 7, 4, 5, 6, 4, 5, 6 };
		System.out.println(singleNumber(nums));
		System.out.println(singleNumber1(nums));
	}

	//HashSet implementation is linear time but uses extra space
	public static int singleNumber(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length;i++) {
			if (!set.add(nums[i])) {
				set.remove(nums[i]);
			}
		}
		Iterator<Integer> it = set.iterator();
		return it.next();
	}
	
	
	//Optimal solution uses XOR's commutative property
	// E.G. (A^B^C^D) == (B^C^D^A) == (D^B^C^A) etc.
	// O(n) time and no extra space
	public static int singleNumber1(int[] nums){
		int result = 0;
		for(int i = 0; i < nums.length;i++){
			result ^=nums[i];
		}
		return result;
	}
}
