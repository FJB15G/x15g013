package jp.ac.chibafjb.x15g013.kd231;

import java.util.Scanner;

public class New231 {

	public static void main(String[] args) {
		int data[] = {4,12,47,71,86};
		Scanner sin = new Scanner(System.in);
		System.out.print("探索値を入力  ->");
		int s =sin.nextInt();
		sin.close();
		int a = ArrayProc.binarySearch1 (data,s);
		if(a==-1){
			System.out.println("探索値"+s+"は、配列data[]に存在しません。");
		}else{
			System.out.println("探索値"+s+"は、配列data["+a+"]に存在します。");
		}
	}

}
class ArrayProc{
	public static int binarySearch1(int[] d,int s){
		int L = 0;
		int H = d.length-1;
		int m = (L + H) / 2;
		while(L<=H && d[m]!=s){
					if(d[m]<s){
						L = m+1;
						m = (L + H) / 2;
					}else{
						H = m-1;
						m = (L + H) / 2;
					}			
		}
		if(L<=H){
			return m;
		}else{
			return -1;
		}
	}
}
