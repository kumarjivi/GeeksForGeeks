package amazon.easy;

import java.util.Scanner;
/***
 * Given a positive integer,
 * return its corresponding column title as appear in an Excel sheet.
 * @author kjivi
 *
 */
class ExcelColumnTitle {
	static StringBuilder sb = new StringBuilder();
	public static void main (String[] args) {
	 Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		for(int k=0; k<numCases; k++) {
		    long col = sc.nextLong();
		    System.out.println(getColTitle(col));
		}
	 }
	 
	private static StringBuilder getColTitle(long colNumber) {
	     if(colNumber == 0) {
	         return new StringBuilder("");
	     }
	     colNumber--;
	     return getColTitle(colNumber/26).append((char)(65 + (colNumber % 26)));
	 }
}
