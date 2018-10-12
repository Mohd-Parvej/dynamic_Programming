package basic;

import java.util.Arrays;
import java.util.Scanner;
/**
 * Longest Increasing Subsequence
 * */
public class LIS {
	
	private static Scanner sc;

	static int lis(int[] a, int n){
		int l[] = new int[n];
        int i, j, max = 0;
        
        //Initialize LIS values for all indexes
        for(i=0; i<n; i++)
           l[i] = 1;
        
        for(i=1; i<n; i++) {
        	for(j=0; j<i; j++) {
        		if(a[i] > a[j] && l[i] < l[j] + 1)
        			l[i] = l[j] + 1;
        	}
        }
        //get the max value
        for(i=0; i<n; i++) {
        	if(max < l[i])
        		max = l[i];
        }
        System.out.println(Arrays.toString(l));
        return max;
    }
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n = sc.nextInt();
	    int[] a = new int[n];
	    for(int i=0; i<n; i++)
	        a[i] = sc.nextInt();
	    System.out.println("Maximum length of LIS: " +lis(a, n));

	}

}
