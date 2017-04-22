#include<stdio.h> 
#include<stdlib.h>
//Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.
//Your algorithm's runtime complexity must be in the order of O(log n).
//If the target is not found in the array, return [-1, -1].
//For example,
//Given [5, 7, 7, 8, 8, 10] and target value 8,
//return [3, 4].
int binarySearch(int* nums,int target,int len){
	int height=len-1;
	int low=0,medium;
	while(low<=height){
		medium=(low+height)/2;
		if(nums[medium]==target){
			return medium;
		}
		else
		  if(nums[medium]>target)
		     height=medium-1;
		  else
		      low=medium+1;
	}
	return -1;
}
int* searchRange(int* nums, int numsSize, int target, int* returnSize) {
    int *b,result,start,end,k,flag=0,flag1=0;
    b=(int *)malloc(sizeof(int)*2);
    result=binarySearch(nums,target,numsSize);
    start=result;
    end=result;
    if(result==-1){
    	*returnSize=2;
    	b[0]=-1;
    	b[1]=-1;
    	return b;
	}
	else{
		for(k=1;k<numsSize;k++){
			if(result-k>=0&&nums[result-k]==target){
				start--;
				flag=1;
			}
			  
			 if(result+k<numsSize&&nums[result+k]==target){
			 	end++; 
			 	flag1=1;
			 }
			if(flag==0&&flag1==0)
			  break;
		} 
	}
	*returnSize=2;
    b[0]=start;
    b[1]=end;
    return b;
}
int main(){
	int a[6]={5,7,7,8,8,10},b[2],*bpoint,*returnSizePoint,returnSize;
	bpoint=b;
	returnSizePoint=&returnSize;
	bpoint=searchRange(a, 6, 8, returnSizePoint); 
	for(int i=0;i<2;i++){
		printf("%d\t",bpoint[i]); 
	}
}
