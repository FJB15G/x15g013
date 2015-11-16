package jp.ac.chibafjb.x15g013.kd142;

import java.util.Scanner;

public class New142 {

	public static void main(String[] args) {
			Scanner a = new Scanner(System.in);
			System.out.print("整数ａの入力　--＞");
			int s = a.nextInt();
			Scanner b = new Scanner(System.in);
			System.out.print("整数bの入力　--＞");
			int x = b.nextInt();
			a.close();
			b.close();
			System.out.println(s+" + "+x+" = "+(s+x));
			System.out.println(s+" - "+x+" = "+(s-x));
			System.out.println(s+" * "+x+" = "+(s*x));
			System.out.println(s+" / "+x+" = "+(s/x));
		

	}

}
