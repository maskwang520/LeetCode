package test;
/**
 * 青蛙跳阶梯问题，DP解决
 * @author maskwang
 *
 */
public class Dpproblem {
	static int sum = 0;
	static int num = 0;
//
//	public static int JumpFloor(int target) {
//		if (sum < target) {
//			for (int i = 1; i <= 2; i++) {
//				sum = sum + i;
//				JumpFloor(target);
//				sum = sum - i;
//			}
//		}
//		if (sum == target) {
//			num++;
//		}
//		return num;
//	}
	/**
	 * 简单的动态规划，状态转移方程f(n)=f(n-1)+f(n-2),n=1,n=2边界
	 * @param target
	 * @return
	 */
	public static int JumpFloor(int target) {
		if(target==0)
			return 0;
		if(target==1)
			return 1;
		if(target==2)
			return 2;
		int a=1,b=2,temp = 0;
		for(int i=3;i<=target;i++){
			temp=a+b;
			a=b;
			b=temp;
		}
		return temp;
	}

	public static void main(String[] args) {
		System.out.println(JumpFloor(4)) ;
	}

}
