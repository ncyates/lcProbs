/*
 * LeetCode 500
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
 * Example 1:

Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]
 
 */
import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] myWords = {"alaska","dad","fad","gab","pot","top","pool","bmz"};
		String res[] = new String[myWords.length];
		res = findWords(myWords);
		for(int i = 0; i < res.length;i++){
			System.out.println(res[i]);
		}
		ArrayList<String> list = new ArrayList<String>();
		//list.
	}

	
    public static String[] findWords(String[] words) {
        String[] keyWords = new String[words.length];
        String regex = "(\\b([qwertyuiop]+|[asdfghjkl]+|[zxcvbnm]+)\\b)";
        int j=0;
        for(int i = 0; i < words.length; i++){        	
            if(words[i].matches(regex)){
                keyWords[j] = words[i];
                j++;
            } 
        }
        return keyWords;
    }
}
