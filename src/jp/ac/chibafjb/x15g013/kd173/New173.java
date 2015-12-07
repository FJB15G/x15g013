package jp.ac.chibafjb.x15g013.kd173;

import java.util.Scanner;

public class New173 {

	public static void main(String[] args) {
		int data[] = new int[4];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<data.length;i++){
		System.out.println("データを入力");
		data[i]= sc.nextInt();
		}
		sc.close();
		int k = 3;
		for(int i=0;i<k;i++)
			data[data.length-1-i] = data[data.length-2-i];
		for(int i=0;i<k+1;i++)
			System.out.println("data["+i+"] = "+data[i]);
	}

}
