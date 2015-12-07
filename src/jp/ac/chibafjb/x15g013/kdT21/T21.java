package jp.ac.chibafjb.x15g013.kdT21;

import java.util.Scanner;

public class T21 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.print("ハンバーガーの個数   --> ");
		int sin1 = sin.nextInt();
		System.out.print("フライドポテトの個数 --> ");
		int sin2 = sin.nextInt();
		int a = 100 * sin1;
		int b = 180 * sin2;
		int c = a + b;
		float d = c * 0.08f;
		float e = c + d;
		
		System.out.println("");
		System.out.println("ハンバーガーの代金   = "+a+"円\n"+
							"フライドポテトの代金 = "+b+"円\n"+
							"小計                 = "+c+"円\n");
		System.out.println("");
		System.out.println("消費税               = "+(int)d+"円\n"+
							"合計金額             = "+(int)e+"円\n");
		System.out.println("");
		System.out.print("受取金額           --> ");
		int sin3 = sin.nextInt();
		System.out.println("つり銭               ="+(int)+(sin3-(int)e)+"円");
		sin.close();

	}

}
