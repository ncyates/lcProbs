/*
 * Leetcode 463
 * You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

Example:

[[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

Answer: 16

 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int perimeter = 0;
		int[][] grid = { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };

		/*
		 * for (int i = 0; i < grid.length; i++) { for (int j = 0; j <
		 * grid[0].length; j++) { if(grid[i][j] == 1){
		 * 
		 * //check top, minding edge if( i == 0 ){ perimeter++; } else {
		 * if(grid[i-1][j] == 0){ perimeter++; } }
		 * 
		 * //check right, minding edge if(j == grid[0].length-1){ perimeter++; }
		 * else{ if(grid[i][j+1]==0){ perimeter++; } }
		 * 
		 * //check bottom, minding edge if(i == grid.length-1){ perimeter++; }
		 * else{ if(grid[i+1][j]==0){ perimeter++; } }
		 * 
		 * //check left, minding edge if(j == 0){ perimeter++; } else{
		 * if(grid[i][j-1]==0){ perimeter++; } } } } }
		 * System.out.println(perimeter);
		 */

		System.out.println(islandPerimeter(grid));
	}

	public static int islandPerimeter(int[][] grid) {
		if (grid == null) {
			return 0;
		}
		int result = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					result += 4;
					if (i > 0 && grid[i - 1][j] == 1)
						result -= 2;
					if (j > 0 && grid[i][j - 1] == 1)
						result -= 2;
				}
			}
		}
		return result;
	}
}
