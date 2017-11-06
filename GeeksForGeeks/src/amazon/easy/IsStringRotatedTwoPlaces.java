package amazon.easy;

import java.util.Scanner;

/***
 * Given two strings, the task is to find if a string ('a') can be obtained
 * by rotating another string ('b') by two places.
 * @author kjivi
 *
 */
public class IsStringRotatedTwoPlaces {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		for(int k=0; k<numCases; k++) {
		    String real = sc.next();
		    String rotated = sc.next();
		    if((real.substring(real.length()-2,real.length())+real.substring(0, real.length()-2)).equals(rotated) ||
		    		(real.substring(2, real.length())+real.substring(0,2)).equals(rotated)) {
		    	System.out.println("1"); 
	        } else {
	            System.out.println("0"); 
	        }
		   // System.out.println(getThatIndex(arr));
		}
	}

}
