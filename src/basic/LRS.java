package basic;

import java.util.Scanner;

public class LRS {
	
	private static Scanner sc;

	static int findLongestRepeatingSubSeq(String str) {
		int len = str.length();
		int[][] l = new int[len+1][len+1];
		
		for(int i=1; i<=len; i++) {
			for(int j=1; j<=len; j++) {
				// If characters match and indexes are not same
				if(str.charAt(i-1) == str.charAt(j-1) && i != j)
					l[i][j] = 1 + l[i-1][j-1];
				// If characters do not match
				else
					l[i][j] = Math.max(l[i][j-1], l[i-1][j]);
			}
		}
		return l[len][len];
	}

	public static void main(String[] args) {
		System.out.println("Enter a string to find the LRS:");
		sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(findLongestRepeatingSubSeq(str));
	}

}
