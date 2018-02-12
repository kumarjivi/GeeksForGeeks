package dp.basic;
/***
 * Given n, and r, find nCr.
 * @author jivi
 *
 */
public class BinomialCoefficient {
	int n;
	int k;
	long[][] arr;
	
	BinomialCoefficient(int n, int k) {
		this.n = n;
		this.k = k;
		arr = new long[k+1][n+1];
	}
	//C(n,k) = C(n-1,k-1) + C(n-1,k).
	//n starts from 0, and k starts from 1. Following must follow:
	//n >=k. n > 1.
	public long getBinomialCoefficient(int n, int k) {
		if(n<=0) {
			return 0;
		}
		//first row should contain all 1s.
		for(int j=1; j<=n; j++) {
			arr[0][j] = 1;
		}
		//if k=1, all cells should contain value equals n.
		for(int j=1; j<=n; j++) {
			arr[1][j] = j;
		}
		
		for(int i=2; i<=k; i++) {
			for(int j=i; j<=n; j++) {
				if(i==j) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = (arr[i-1][j-1] + arr[i][j-1])%1000000007;					
				}
			}
		}
		
//		for(int j=2; j<=n; j++) {
//			for(int i=j; i<=k; i++) {
//				if(i==j) {
//					arr[i][j] = 1;
//				} else {
//					arr[i][j] = arr[i-1][k-1] + arr[k][n-1];
//				}
//			}
//		}
		for(int i=0; i<=k; i++) {
			for(int j=0; j<=n; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		return arr[k][n];
	}
	
	public long getBinomialCoefficient() {
		return getBinomialCoefficient(this.n, this.k);
	}
	
}
