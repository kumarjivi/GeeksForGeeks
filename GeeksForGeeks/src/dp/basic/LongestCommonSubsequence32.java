package dp.basic;
/**
 * Given two sequences, find the length of longest subsequence present in both of them.
 * A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous.
 * For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are subsequences of “abcdefg”.
 * So a string of length n has 2^n different possible subsequences.
 * @author jivi
 *
 */
public class LongestCommonSubsequence32 {

	public static void main(String[] args) {
		String one = "ABCDGH";
		String two = "AEDFHR";
		System.out.println(getLongestCommonSubseq(one, two));
	}
	
	public static int getLongestCommonSubseq(String str1, String str2) {
		if(str1 == null || str2 == null || str1.length() == 0 || str2.length() == 0) {
			return 0;
		}
		return helper(str1.toCharArray(), 0, str2.toCharArray(), 0);
	}
	
	public static int helper(char[] s, int i, char[] t, int j) {
		if(i >= s.length || j >= t.length) {
			return 0;
		}
		if(i == s.length-1 && j == t.length-1) {//if its the last character of both.
			if(s[i] == t[j]) {
				return 1;
			} else {
				return 0;
			}
		}
		if(s[i] == t[j]) {
			int ans = 1 + helper(s, i+1, t, j+1);
			return ans;
		} else {
			int one = helper(s, i+1, t, j);
			int two = helper(s, i, t, j+1);
			return Math.max(one, two);
		}
	}
}
