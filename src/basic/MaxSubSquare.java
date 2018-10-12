package basic;

import java.util.Scanner;

public class MaxSubSquare {
	private static Scanner sc;
	
	static void printMaxSubSquare(int[][] m) {
		int i, j;
		int r = m.length;
		int c = m[0].length;
		int[][] s = new int[r][c];
		
		//copy 1st column into s
		for(i=0; i<r; i++)
			s[i][0] = m[i][0];
		//copy 1st row into s
		for(j=0; j<c; j++)
			s[0][j] = m[0][j];
		
		for(i=1; i<r; i++) {
			for(j=1; j<c; j++) {
				if(m[i][j] == 1)
					s[i][j] = Math.min(s[i][j-1], Math.min(s[i-1][j], s[i-1][j-1])) + 1;
				else
					s[i][j] = 0;
			}
		}
		for(i=0; i<r; i++) {
			for(j=0; j<c; j++) {
				System.out.print(s[i][j] + " ");
			}
			System.out.println();
		}
		//getting max value with index in s matrix
		int max_val = s[0][0], max_i = 0, max_j = 0;
		for(i=0; i<r; i++) {
			for(j=0; j<c; j++) {
				if(max_val < s[i][j]) {
					max_val = s[i][j];
					max_i = i;
					max_j = j;
				}
			}
		}
		System.out.println("Maximum size square matrix:");
		for(i=max_i; i>max_i-max_val; i--) {
			for(j=max_j; j>max_j-max_val; j--) {
				System.out.print(m[i][j]+ "  ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		
		/*System.out.println("Enter the values of row and column:");
		sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		//creating a matrix 
		int[][] mat = new int[row][col];
		
		System.out.println("Please enter the matrix values for (" +row+ ", " +col+ ")");
		for(int i=0; i<row; i++)
			for(int j=0; j<col; j++)
				mat[i][j] = sc.nextInt();
		printMaxSubSquare(mat);*/
		
		int M[][] =  {{0, 1, 1, 0, 1},  
                {1, 1, 0, 1, 0},  
                {0, 1, 1, 1, 0}, 
                {1, 1, 1, 1, 0}, 
                {1, 1, 1, 1, 1}, 
                {0, 0, 0, 0, 0}}; 
         
		printMaxSubSquare(M); 
	}

}
