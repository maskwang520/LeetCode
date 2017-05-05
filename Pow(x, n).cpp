#include<stdio.h>
double myPow(double x, int n) {
	if(x==0)
	return 0;
    if(n==0)
    return 1;
    int i,flag=0;
    double sum=1;
    if(n<0){
    	n=-n;
    	flag=1;
	}
    for(i=1;i<=n;i++){
    	sum=sum*x;
	}
	if(flag==1){
		sum=1/sum;
	}
	return sum;
}
int powfun(double x,int n){
	if(n>0){
		
	}
	else
	   return 1;
}
int main(){
	
} 


