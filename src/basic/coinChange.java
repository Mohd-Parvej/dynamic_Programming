package basic;

import java.util.Scanner;

public class coinChange {
	
	private static Scanner sc;
	
	static long countWays(int[] a, int m, int n){
        long[] t = new long[n+1];
        t[0] = 1;
        
        for(int i=0; i<m; i++)
            for(int j=a[i]; j<=n; j++)
                t[j] += t[j - a[i]];
                
        return t[n];
    }

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int m = sc.nextInt();
	    int[] a = new int[m];
	    System.out.println("Enter the array elements:");
	    for(int i=0; i<m; i++)
	        a[i] = sc.nextInt();
	    System.out.println("Enter the value of n:");
	    int n = sc.nextInt();
	    System.out.println("Total number of ways: " +countWays(a, m, n));
	}

}
