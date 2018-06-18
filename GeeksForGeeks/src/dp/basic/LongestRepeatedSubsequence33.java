package dp.basic;

import java.util.Scanner;
/**
 * Given a string str, find length of the longest repeating subsequence
 * such that the two subsequence don’t have same string character at same
 * position, i.e., any i’th character in the two subsequences shouldn’t
 * have the same index in the original string.
 * @author jivi
 */
public class LongestRepeatedSubsequence33 {

	public static void main (String[] args) {
		 Scanner sc = new Scanner(System.in);
			int numCases = sc.nextInt();
			for(int k=0; k<numCases; k++) {
				sc.nextInt();
			    System.out.println(getLongestRepeatingSubseq(sc.next()).length());
			}
		 }
	static String[][] memo;
	public static String getLongestRepeatingSubseq(String str) {
		if(str == null || str.length() == 0) {
			return "";
		}
		memo = new String[str.length()][str.length()];
		return helper(str.toCharArray(), 0, str.toCharArray(), 0);
	}
	
	public static String helper(char[] s, int i, char[] t, int j) {
		if(i >= s.length || j >= t.length) {
			return "";
		}
		if(memo[i][j] != null) {
			return memo[i][j];
		}
		if(i == s.length-1 && j == t.length-1) {//if its the last character of both.
			if(s[i] == t[j] && i != j) {
				memo[i][j] = s[i]+"";
				
			} else {
				memo[i][j] = "";
			}
			return memo[i][j];
		}
		if(s[i] == t[j] && i != j) {
			String ans = s[i] + helper(s, i+1, t, j+1);
			memo[i][j] = ans;
			return ans;
		} else {
			String one = helper(s, i+1, t, j);
			String two = helper(s, i, t, j+1);
			memo[i][j] = one.length() > two.length() ? one : two;
			return memo[i][j];
		}
	}

}
