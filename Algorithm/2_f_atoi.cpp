#include <stdio.h>
#include <string.h>
#include<iostream> 
using namespace std;
int fatoi(char strdata[])
{
	bool flag = true;
	int len_n = strlen(strdata);
	int num = 0, sum = 0;
	for (int i= 0; i<len_n; i++)
	{
		if (strdata[i] == '+'|| strdata[i]== ' ')
			continue;
		
		if (strdata[i] == '-')
			flag = false;
		
		num = (strdata[i] - '0');
		sum = sum + num;
		if(i<len_n-1)
			sum = sum *10 ;
	}
	if (flag == false)
	    sum =(0-sum);
	cout << sum << endl;	
	return sum;
	
}

int main()
{
	char strdata[10] = {"4356"};
	int n = fatoi(strdata);
	cout << n << endl ;
}
