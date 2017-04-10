/* LeetCode 461
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.

 */
public class Solution {

	public static void main(String[] args){
		
		
		int x = 1;
		int y = 4;
		System.out.println(hamDist(x,y));
		
		

	}
	
	public static int hamDist(int x, int y){
		return Integer.bitCount(x^y);
	}
	
	public static int HamDist1(int x, int y){
		int hamDist = 0;
		//int[] xB = new int[32];
		//int[] yB = new int[32];
		
		
		//for(int i = 31; i >=0;i--){			
			//if(x%2 != y%2){
				//hamDist++;
			//}
			//x/=2;
			//y/=2;
			
			/*if(x%2 != 0){
				xB[i] = 1;
			}
			else{
				xB[i] = 0;
			}
			x/=2;
			if(y%2 != 0){
				yB[i] = 1;
			}
			else{
				yB[i] = 0;
			}
			y/=2;
			*/
			//}
				
		
		
		String xBin = Integer.toBinaryString(x);
        String yBin = Integer.toBinaryString(y);
        //String s = "1000";
        
        //System.out.println("1000 is " + Integer.parseInt(s, 2));
		
		
/*		for(int j = 0;j<xB.length;j++){
			System.out.print(xB[j]);
		}
		
		System.out.println();

		for(int j = 0;j<xB.length;j++){
			System.out.print(yB[j]);
		}
		
		
		
		for(int i = 0; i < 32; i++){
			if(xB[i] != yB[i]){
				hamDist++;
			}
		}
		
		System.out.println();
*/
        return hamDist;
    }
	
}
