/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example: 
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9, 
return [0, 1].

*/
#include<iostream> 
using namespace std;
int target = 8;
int main()
{   
	int arrayval[4] = {2,5,6,12};
	for(int i = 0; i<= 4-1; i++)
		for (int j= i+1; j< 4; j++)
		{
			if (arrayval[i]+arrayval[j] == target)
				cout<< i << " " << j;
		}
}


