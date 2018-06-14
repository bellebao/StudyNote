package Test;

public class strStr {
	public static void main(String [] args)
	{
		String haystack = "hello world, what is your name?";
		String needle = "what";
		//if(needle == null) System.out.println(" not found");
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

				
	}

}
