package jp.ac.chibafjb.x15g013.kd243;

public class New243 {

	public static void main(String[] args) {
		int num[] = {75,31,64,27,5};
		System.out.print("整列前： num[] = ");
		for(int x:num)
		System.out.print(x+",");
		System.out.println("");
		int[] a = ArrayProc.bubbleSort(num);
		System.out.print("整列後： num[] = ");
		for(int y:a)
		System.out.print(y+",");
	}

}
 class ArrayProc {

	public static int[] bubbleSort(int[] num) {
		int work;
		for(int j = num.length-1;j>=1;j--){
			for(int i=0;i<j;i++){
		if(num[i]<num[i+1]){
			work = num[i];
			num[i] = num[i+1];
			num[i+1] = work;
				}
			}
		}
		return num;
	}

}