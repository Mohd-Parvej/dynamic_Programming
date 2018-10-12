package basic;

import java.util.Scanner;

public class LSCS {
	
	private static Scanner sc;
	
	static void kadane(int[] a, int n){
        int m=0, max = 0, start = 0, end = 0, s = 0;
        for(int i=0; i<n; i++){
            m += a[i];
            if(max < m) {
            	max = m;
            	start = s;
            	end = i;
            }
            if(m < 0) {
            	m = 0;
            	s = i+1;
            }
        }
        System.out.println("Maximum contiguous sum is " +max+ " Starting index " +start+ " Ending index " +end);
    }

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n = sc.nextInt();
	    int[] a = new int[n];
	    System.out.println("Enter the array elements:");
	    for(int i=0; i<n; i++)
	        a[i] = sc.nextInt();
	    kadane(a, n);
	}

}
