/*
 * 
 * 题目： 
Given a string containing just the characters , determine if the input string is valid.

The brackets must close in the correct order, “()” and “()[]{}” are all valid but “(]” and “([)]” are not.

翻译： 
给定一个字符串，只包含’(‘, ‘)’, ‘{‘, ‘}’, ‘[’ 和’]’这些字符，检查它是否是“有效”的。 
括号必须以正确的顺序关闭，例如”()” 和”()[]{}”都是有效的，”(]” 和”([)]”是无效的。

 * 
 */

package Test;

public class ValidParentheses {
	public static void main(String [] args)
	{
		String S = "{,]";
		char start = ' ';
		for(char c : S.toCharArray())
		{
			switch(c)
			{
			case '{':
			case '[':
			case '(':
				start = c;
				break;
			case '}':
				if (start != '{')
				{
					System.out.println("{false");
					break;
				}
				else
				{
					System.out.println("{true");
					break;
				}
			case ']':
				if (start != '[')
				{
					System.out.println("[false");
					break;
				}
				else
				{
					System.out.println("[true");
					break;
				}
			case ')':
				if (start != '(')
				{
					System.out.println("false");
					break;
				}
				else
				{
					System.out.println("true");
					break;
				}
					
			}
				
		}
	}

}
