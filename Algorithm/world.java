
/** 
 * 3Sum 
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero. 
 
Note: 
Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ¡Ü b ¡Ü c) 
The solution set must not contain duplicate triplets. 
    For example, given array S = {-1 0 1 2 -1 -4}, 
 
    A solution set is: 
    (-1, 0, 1) 
    (-1, -1, 2)  
    */

package Test;

import java.util.Arrays;  

public class world {
	public static void main(String [] args)
	{
		int[] A = { -2, 0, 1, 1, 2, -1 }; 
		int sum = 0;
		boolean findflag = false;
		Arrays.sort(A);  
		System.out.println(Arrays.toString(A));
        int len = A.length;  
        for (int i = 0; i < len; i++) {  
            int l = i + 1;  
            int r = len - 1;  
            while (l < r) {  
                if (A[i] + A[l] + A[r] == sum) {  
                    System.out.println(A[i] + ", " + A[l] + ", " + A[r]);  
                    findflag = true;
                    break;  
                } else if (A[i] + A[l] + A[r] < sum) {  
                    l++;  
                } else {  
                    r--;  
                }  
            }  
        }  
        if (findflag == false)
        		{System.out.println("Not found!");  }
	}

}
