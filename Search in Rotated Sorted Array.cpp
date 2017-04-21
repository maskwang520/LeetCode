#include<stdio.h> 
int binarySearch(int *nums,int low,int hight,int target){
	int medium;
	while(low<=hight){
		medium=(low+hight)/2;
		if(*(nums+medium)== target){
			return medium;
		}
		if(*(nums+medium)> target){
			hight=medium-1;
		}
		if(*(nums+medium)< target){
			low=medium+1;
		}
	}
	return -1;
}

int search(int* nums, int numsSize, int target) {
     int i=0;
     for(i=0;i<numsSize-1;i++){
     	if(nums[i]>nums[i+1])
     	  break;
	 }

	    if(target>=nums[0]&&target<=nums[i])
	        return binarySearch(nums,0,i,target);
	    else
	      if(target>=nums[i+1]&&target<=nums[numsSize-1])
	        return binarySearch(nums,i+1,numsSize-1,target);
	return -1;
}
int main(){
	int nums[2]={3,1};
	printf("%d",search( nums, 2, 1));
}
