package basic;

import java.util.Scanner;

/**
 * Min Cost Path
 */

public class min_Cost_Path {
	
	private static Scanner sc;
	
	static void cost_Path(int[][] cost, int n){
		int i, j;
		int tc[][]=new int[n+1][n+1];

		tc[0][0] = cost[0][0];

		/* Initialize first column of total cost(tc) array */
		for (i = 1; i <= n; i++)
			tc[i][0] = tc[i-1][0] + cost[i][0];

		/* Initialize first row of tc array */
		for (j = 1; j <= n; j++)
			tc[0][j] = tc[0][j-1] + cost[0][j];

		/* Construct rest of the tc array */
		for (i = 1; i <= n; i++)
			for (j = 1; j <= n; j++)
				tc[i][j] = Math.min(tc[i-1][j-1], Math.min(tc[i-1][j], tc[i][j-1])) + cost[i][j];
        System.out.println(tc[n][n]);
    }

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the matrix size");
		int n = sc.nextInt();
	    int[][] a = new int[n][n];
	    
	    for(int i=0; i<n; i++)
	        for(int j=0; j<n; j++)
	            a[i][j] = sc.nextInt();
        for(int i=0; i<n; i++) {
	    	for(int j=0; j<n; j++) {
	    		System.out.print(a[i][j]+ "  ");
	    	}
	    	System.out.println();
	    }
	    
	    cost_Path(a, n-1);

	}

}
