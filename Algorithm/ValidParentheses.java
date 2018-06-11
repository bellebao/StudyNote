/*
 * 
 * ��Ŀ�� 
Given a string containing just the characters , determine if the input string is valid.

The brackets must close in the correct order, ��()�� and ��()[]{}�� are all valid but ��(]�� and ��([)]�� are not.

���룺 
����һ���ַ�����ֻ������(��, ��)��, ��{��, ��}��, ��[�� �͡�]����Щ�ַ���������Ƿ��ǡ���Ч���ġ� 
���ű�������ȷ��˳��رգ����硱()�� �͡�()[]{}��������Ч�ģ���(]�� �͡�([)]������Ч�ġ�

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
