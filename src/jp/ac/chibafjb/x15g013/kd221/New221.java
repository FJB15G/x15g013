package jp.ac.chibafjb.x15g013.kd221;


public class New221 {

	public static void main(String[] args) {
		int score[] = new int[100];
		score[99] = 999;
		int a = 5;
		int b = ArrayProc1.linerSearch1(score,a);
		if(b == -1){
			System.out.println("探索値"+a+"は、配列score[]に存在しません。");
		}else{
			System.out.println("探索値"+a+"は、配列score["+b+"]に存在します。");
		}
		int c = ArrayProc2.linerSearch2(score,a);
		if(c == -1){
			System.out.println("探索値"+a+"は、配列score[]に存在しません。");
		}else{
			System.out.println("探索値"+a+"は、配列score["+c+"]に存在します。");
		}
		
	}
}
class ArrayProc1{
	public static int linerSearch1(int[] s,int n){
		for(int i=0;i<100;i++){
			if(s[i] == n){
				return i; 	
			}
		}
		return -1;
	}
}
class ArrayProc2{
	public static int linerSearch2(int[] s,int n){
		int i;
		for(i=99;i>-1;i--){
			if(s[i] == n){
				return i;
			}
		}
		return -1;
	}
}

