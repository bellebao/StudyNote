/*
 * 
 * Implement strStr(). 
Returns the index of the first occurrence of needle in haystack, 
or -1 if needle is not part of haystack.
 */
package Test;
import java.util.Scanner;

public class strStr {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" input haystack:");
		String haystack = sc.next();
		System.out.println(" haystack = :" + haystack);
		System.out.println(" input needle:");
		String needle = sc.next();
		System.out.println(" needle = :" + needle);
		//String haystack = "hello world, what is your name?";
		//String needle = "what";
		if(needle == null) System.out.println(" not found");
		int m = haystack.length();
		int n = needle.length();

		if (m<n) System.out.println("needle is longer than haystack");
		for (int i = 0; i<= m-n; ++i)
		{
			int j = 0;
			for (j=0; j<n; j++ )
			{				
				if(haystack.charAt(i+j)!=needle.charAt(j))			
					break;				
				
			}
			if(j==n) System.out.println( "needle is at :" + i);
			
		}

		sc.close();		
	}

}
