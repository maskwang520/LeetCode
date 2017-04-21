#include<stdio.h>
//method:from the reverse second number,find the smallest number but greater than
//this number,swap two target number.than sort the right rest number.if there is the
//target number,just,reverse the nums.
void nextPermutation(int* nums, int numsSize) {
    int j,i,k,temp,m,n,min=nums[numsSize-1],flag=1,flag1=1,minf;
    for(j=numsSize-2;j>=0;j--){
    	for(k=j+1;k<numsSize;k++){//找到它右边比它大的数 
    	 if(nums[k]>nums[j]){
    		min=nums[k];
    	    minf=k;
    	    flag1=0;
    	    break;
		 }
		}
    	if(flag1==1){
    		continue;  //没有这个数，则跳过此次循环 
		}
    	for(i=minf;i<=numsSize-1;i++){ //如果有，则找出右边最小的，但比目标数大 
            if(nums[i]>nums[j]&&nums[i]<min){
            	min=nums[i];
            	minf=i; 
			}   		
              
		}
		if(min!=nums[j]){
			flag=0;
			break; 
		}
		  
	}
	if(flag==0){//交换之，并排序 
		temp=nums[minf];
		nums[minf]=nums[j];
		nums[j]=temp;
		for(m=j+1;m<=numsSize-2;m++){
			k=m;
			for(n=m+1;n<=numsSize-1;n++){
				if(nums[k]>nums[n])
				   k=n;
			} 
			if(k!=m){
				temp=nums[k];
				nums[k]=nums[m];
				nums[m]=temp;
			}
		}
	}
	else{ //翻转整个数组 
		for(i=0;i<numsSize/2;i++){
			temp=nums[i];
			nums[i]=nums[numsSize-i-1];
			nums[numsSize-i-1]=temp;
		}
	} 
	
}
int main(){
	int nums[3]={1,3,2};
	nextPermutation(nums,3);
	for(int i=0;i<3;i++){
		printf("%d",nums[i]);
	}
}
