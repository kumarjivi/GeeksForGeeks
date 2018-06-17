package dp.basic;

import java.util.Scanner;

/**
 * Given two sequences, find the length of longest subsequence present in both of them.
 * A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous.
 * For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are subsequences of “abcdefg”.
 * So a string of length n has 2^n different possible subsequences.
 * @author jivi
 *
 */
/*
2
6 6
ABCDGH
AEDFHR
3 2
ABC
AC
 */
public class LongestCommonSubsequence32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		for(int k=0; k<numCases; k++) {
			sc.nextInt();
			sc.nextInt();
			String one = sc.next();
			String two = sc.next();
			
			System.out.println("Length: "+getLongestCommonSubseq(one, two));
		}		
	}
	static int[][] memo;
	public static int getLongestCommonSubseq(String str1, String str2) {
		if(str1 == null || str2 == null || str1.length() == 0 || str2.length() == 0) {
			return 0;
		}
		memo = new int[str1.length()][str2.length()];
		for(int i=0; i<memo.length; i++) {
			for(int j=0; j<memo[0].length; j++) {
				memo[i][j] = -1;
			}
		}
		return helper(str1.toCharArray(), 0, str2.toCharArray(), 0);
	}
	
	public static int helper(char[] s, int i, char[] t, int j) {
		if(i >= s.length || j >= t.length) {
			return 0;
		}
		if(memo[i][j] != -1) {
			return memo[i][j];
		}
		if(i == s.length-1 && j == t.length-1) {//if its the last character of both.
			if(s[i] == t[j]) {
				memo[i][j] = 1;
				return 1;
			} else {
				memo[i][j] = 0;
				return 0;
			}
		}
		if(s[i] == t[j]) {
			int ans = 1 + helper(s, i+1, t, j+1);
			memo[i][j] = ans;
			return ans;
		} else {
			int one = helper(s, i+1, t, j);
			int two = helper(s, i, t, j+1);
			memo[i][j] = Math.max(one, two);
			return memo[i][j];
		}
	}
}
