package jp.ac.chibafjb.x15g013.kd143;

import java.util.Scanner;

public class New143 {

	public static void main(String[] args) {
		Scanner box1 = new Scanner(System.in);
		System.out.print("住所の入力　--＞");
		String a = box1.next();
		Scanner box2 = new Scanner(System.in);
		System.out.print("氏名の入力　--＞");
		String b = box2.next();
		Scanner box3 = new Scanner(System.in);
		System.out.print("電話番号の入力　--＞");
		String c = box3.next();
		box1.close();
		box2.close();
		box3.close();
		System.out.format("%s\n%s\n%s\n",a,b,c);

	}

}
