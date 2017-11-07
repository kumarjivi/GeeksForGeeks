package amazon.easy;

import java.util.Scanner;
import java.util.Stack;
public class SmallestNumberOnLeft {

	public static void main (String[] args) {
		 Scanner sc = new Scanner(System.in);
			int numCases = sc.nextInt();
			for(int k=0; k<numCases; k++) {
				int n = sc.nextInt();
				int[] thisArray = new int[n];
				for(int j=0; j<n; j++) {
				    thisArray[j] = sc.nextInt();
				}
				int[] output = new int[n];
				output = getSmallestOnLeft(thisArray);
				for(int j=0; j<n; j++) { 
				    System.out.print(output[j]+" ");
				}
			    System.out.println();
			}
		 }
	
	private static int[] getSmallestOnLeft(int[] arr) {
	     int[] out = new int[arr.length];
	     if(arr.length == 0) {
	         return out;
	     }
	     out[0] = -1;
	     Stack<Integer> stack = new Stack<Integer>();
	     Stack<Integer> tempStack = new Stack<Integer>();
	     stack.push(arr[0]);
	     for(int i=1; i<arr.length; i++) {
	         while(stack.size() > 0 && arr[i] <= stack.peek()) {
	             tempStack.push(stack.pop());
	         }
	         if(stack.size() == 0) {
	             out[i] = -1;
	         } else {
	             out[i] = stack.peek();
	         }
	         while(tempStack.size() > 0) {
	             stack.push(tempStack.pop());
	         }
	         stack.push(arr[i]);
	     }
	     return out;
	 }

}