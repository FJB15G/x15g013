package jp.ac.chibafjb.x15g013.kd151;

import java.util.Scanner;

public class New151 {

	public static void main(String[] args) {
		Scanner king1 = new Scanner(System.in);
		System.out.print("aの入力 --＞ ");
		double a = king1.nextDouble();
		Scanner king2 = new Scanner(System.in);
		System.out.print("bの入力 --＞ ");
		double b = king2.nextDouble();
		king1.close();
		king2.close();
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" * "+b+" = "+(a*b));
		System.out.println(a+" / "+b+" = "+(a/b));
		
		
		
		

	}

}
