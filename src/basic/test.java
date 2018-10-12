package basic;

import java.util.Arrays;
import java.util.Scanner;

public class test {
	private static Scanner sc;
	
	static int cost_Path(int[][] cost, int m, int n){
		int[][] tc = new int[m][n];
		tc[0][0] = cost[0][0];
		int i, j;
		
		//Initialize first column 
		for(i=1; i<m; i++)
			tc[i][0] = tc[i-1][0] + cost[i][0];
		
		//Initialize first row
		for(j=1; j<n; j++)
			tc[0][j] = tc[0][j-1] +cost[0][j];
		
		for(i=1; i<m; i++)
			for(j=1; j<n; j++)
				tc[i][j] = Math.min(Math.min(tc[i-1][j-1], tc[i-1][j]), tc[i][j-1]) + cost[i][j];
		
		return tc[m-1][n-1];
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the matrix size");
		int m = sc.nextInt();
		int n = sc.nextInt();
	    int[][] a = new int[m][n];
	    
	    System.out.println("Enter the matrix elements:");
	    for(int i=0; i<n; i++)
	        for(int j=0; j<n; j++)
	            a[i][j] = sc.nextInt();
	    System.out.println("Given matrix is:\n");
        for(int i=0; i<n; i++) {
	    	for(int j=0; j<n; j++) {
	    		System.out.print(a[i][j]+ "  ");
	    	}
	    	System.out.println();
	    }
	    
	    System.out.println("Min cost path: " +cost_Path(a, m, n));

	}

}
