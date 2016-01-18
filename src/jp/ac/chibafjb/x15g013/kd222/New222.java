package jp.ac.chibafjb.x15g013.kd222;

public class New222 {

	public static void main(String[] args) {
		double score[] = new double[100];
		score[99] = 999;
		double a = 5.3;
		double b = ArrayProc1.linerSearch1(score,a);
		if(b == -1){
			System.out.println("探索値"+a+"は、配列score[]に存在しません。");
		}else{
			System.out.println("探索値"+a+"は、配列score["+b+"]に存在します。");
		}
//		int c = ArrayProc2.linerSearch2(score,a);
//		if(c == -1){
//			System.out.println("探索値"+a+"は、配列score[]に存在しません。");
//		}else{
//			System.out.println("探索値"+a+"は、配列score["+c+"]に存在します。");
//		}
		
	}
}
class ArrayProc1{
	public static double linerSearch1(double[] s,double n){
		for(int i=0;i<100;i++){
			if(s[i] == n){
				return i; 	
			}
		}
		return -1;
	}
}
//class ArrayProc2{
//	public static int linerSearch2(int[] s,int n){
//		int i;
//		for(i=99;i>-1;i--){
//			if(s[i] == n){
//				return i;
//			}
//		}
//		return -1;
//	}
//}
