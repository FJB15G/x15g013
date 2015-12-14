package jp.ac.chibafjb.x15g013.kd211;

public class New211 {

	public static void main(String[] args) {
		int num[] = {1,2,3,4,5};
		int a = 5;
		int b = ArrayProc1.maxFind1(num,a);
		System.out.println(b);
		int c = ArrayProc2.maxFind2(num,a);
		System.out.println(c);
	}
}

class ArrayProc1{
	public static int maxFind1(int[] num,int a){
		int x = 0;
		for(int i=0;i<a;i++){
			if(num[i]>x){
				x = num[i];
			}
		}
		return x;
	}
}
	
class ArrayProc2{
	public static int maxFind2(int[] num,int a){
		int y = 0;
		a += 1;
		for(int i=1;i<a;i++){
			if(num[i-1]>y){
				y = num[i-1];
			}
		}
		return y;
	}
	
}


