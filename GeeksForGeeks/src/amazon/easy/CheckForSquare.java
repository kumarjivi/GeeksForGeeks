package amazon.easy;

import java.util.Scanner;

import amazon.commonStruct.Point;

/***
 * Given coordinates of four points in a plane,
 * find if the four points form a square or not.
 * @author kjivi
 *
 */
public class CheckForSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of test cases:");
		int numCases = sc.nextInt();
		for(int k=0; k<numCases; k++) {
			System.out.println("For test case "+(k+1));
			System.out.println("Enter points 1 through 4 in format x y:");
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			int x3 = sc.nextInt();
			int y3 = sc.nextInt();
			
			int x4 = sc.nextInt();
			int y4 = sc.nextInt();
			
			Point p1 = new Point(x1, y1);
			Point p2 = new Point(x2, y2);
			Point p3 = new Point(x3, y3);
			Point p4 = new Point(x4, y4);
			Point[] points = {p1,p2,p3,p4};
			System.out.println(ifSquare(points));
//		    System.out.println("Row with min number of 1's is: "+output);
		}
	}
	
	private static boolean ifSquare(Point[] points) {
		long d1 = -1, d2 = -1;
		for(int i=0; i<points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				Point p1 = points[i];
				Point p2 = points[j];
				if(p1.getX() == p2.getX() && p1.getY() == p2.getY()) {
					return false;
				}
				long d = calculateDistance(p1, p2);
				if(d == d1 || d == d2) {
					continue;
				}
				if (d1 == -1) {
					d1 = d;
				} else if (d2 == -1) {
					d2 = d;
				} else {
					if(d != d1 && d != d2) {
						return false;
					}
				}
			}
		}
		if(d1 <= 0 || d2 <= 0) {
			return false;
		}
		if(d1 > d2) {//d1 corresponds to length of side and d2 corresponds to length of diagonal.
			return d1 == 2*d2;
		} else {
			return d2 == 2*d1;
		}
	}
	
	private static long calculateDistance(Point p1, Point p2) {
		long d = -1;
		d = (p2.getY() - p1.getY()) * (p2.getY() - p1.getY()) +
				(p2.getX() - p1.getX()) * (p2.getX() - p1.getX());
		return d;
	}
}
