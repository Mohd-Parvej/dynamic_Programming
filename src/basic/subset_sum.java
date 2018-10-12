package basic;

import java.util.Arrays;
import java.util.Scanner;

public class subset_sum {
	
	private static Scanner sc;
	
	static boolean isSubsetSum(int set[], int n, int sum)
    {
		System.out.println(Arrays.toString(set)+ ", n=" +n+ ", sum="+sum);
       // Base Cases
       if (sum == 0)
         return true;
       if (n == 0 && sum != 0)
         return false;
      
       // If last element is greater than sum, then ignore it
       if (set[n-1] > sum)
         return isSubsetSum(set, n-1, sum);
      
       /* else, check if sum can be obtained by any of the following
          (a) including the last element
          (b) excluding the last element   */
       return isSubsetSum(set, n-1, sum) || 
                                   isSubsetSum(set, n-1, sum-set[n-1]);
    }
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Please enter the array size: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int sum = 9;
		System.out.println("Please enter the array elements: ");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		if (isSubsetSum(a, n, sum) == true)
            System.out.println("Found a subset with given sum");
        else
            System.out.println("No subset with given sum");
	}

}
