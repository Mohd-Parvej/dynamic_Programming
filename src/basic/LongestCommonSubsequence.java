package basic;

import java.util.Scanner;

public class LongestCommonSubsequence {
	
	private static Scanner sc;

	static int lcs(char[] x, char[] y, int m, int n) {
		int l[][] = new int[m+1][n+1];
		
		for(int i=0; i<=m; i++) {
			for(int j=0; j<=n; j++) {
				if(i == 0 || j == 0)
					l[i][j] = 0;
				else if(x[i-1] == y[j-1])
					l[i][j] =  1 + l[i-1][j-1];
				else
					l[i][j] = max(l[i-1][j], l[i][j-1]);
			}
		}
		return l[m][n];
	}
	
	static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public static void main(String[] args) {
		System.out.println("Enter the 2 strings to find the LCS:");
		sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		char[] x = str1.toCharArray();
		char[] y = str2.toCharArray();
		int m = x.length;
		int n = y.length;
		System.out.println("Length of LCS: " +lcs(x, y, m, n));
	}

}
