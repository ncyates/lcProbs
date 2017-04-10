/*
 * Leetcode 496
 *  You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. Find all the next greater numbers for nums1's elements in the corresponding places of nums2.

The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, output -1 for this number.

Example 1:

Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
Output: [-1,3,-1]
Explanation:
    For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
    For number 1 in the first array, the next greater number for it in the second array is 3.
    For number 2 in the first array, there is no next greater number for it in the second array, so output -1.

Example 2:

Input: nums1 = [2,4], nums2 = [1,2,3,4].
Output: [3,-1]
Explanation:
    For number 2 in the first array, the next greater number for it in the second array is 3.
    For number 4 in the first array, there is no next greater number for it in the second array, so output -1.

Note:

    All elements in nums1 and nums2 are unique.
    The length of both nums1 and nums2 would not exceed 1000.

 */
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		int[] nums1 = { 4, 1, 2 }, nums2 = { 1, 3, 4, 2 };
		// int[] nums1 = {2,4}, nums2 = {1,2,3,4};

		int[] result = nextGreaterElement1(nums1, nums2);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

	public static int[] nextGreaterElement(int[] findNums, int[] nums) {
		int[] res = new int[findNums.length];
		for (int i = 0; i < findNums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if (nums[j] > findNums[i]) {
					res[i] = nums[j];
					break;
				}
				res[i] = -1;
			}
			System.out.println(res[i]);
		}
		return res;
	}

	public static int[] nextGreaterElement2(int[] findNums, int[] nums) {
		Map<Integer, Integer> map = new HashMap<>(); // map from x to next
														// greater element of x
		Stack<Integer> stack = new Stack<>();
		for (int num : nums) {
			while (!stack.isEmpty() && stack.peek() < num)
				map.put(stack.pop(), num);
			stack.push(num);
		}
		for (int i = 0; i < findNums.length; i++)
			findNums[i] = map.getOrDefault(findNums[i], -1);
		return findNums;
	}

	//Accepted O(n + m) time complexity
	public static int[] nextGreaterElement1(int[] findNums, int[] nums) {
		Stack<Integer> stack = new Stack<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] res = new int[findNums.length];
		for (int i = 0; i < nums.length; i++) {
			while (!stack.empty() && nums[i] > stack.peek())
				map.put(stack.pop(), nums[i]);
			stack.push(nums[i]);
		}
		while (!stack.empty())
			map.put(stack.pop(), -1);
		for (int i = 0; i < findNums.length; i++) {
			res[i] = map.get(findNums[i]);
		}
		return res;
	}
	
	//end class
}