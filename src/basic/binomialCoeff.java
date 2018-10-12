package basic;

import java.util.Scanner;

public class binomialCoeff {
	
	private static Scanner sc;

	static int min(int x, int y) {
		if(x < y)
			return x;
		else
			return y;
	}
	
	static int coeff(int n, int k) {
		int[] c = new int[k+1];
		c[0] = 1;
		for(int i=1; i<=n; i++) {
			// Compute next row of pascal triangle using the previous row
			for(int j=min(i, k); j>0; j--) {
				c[j] = c[j] + c[j-1];
			}
		}
		return c[k];
	}

	public static void main(String[] args) {
		System.out.println("Enter the value for n and k:");
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println("Binomial coefficient of C(" +n+ ", " +k+ "): " + coeff(n, k));
	}

}
