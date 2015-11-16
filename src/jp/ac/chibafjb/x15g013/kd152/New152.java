package jp.ac.chibafjb.x15g013.kd152;

import java.util.Scanner;

public class New152 {

	public static void main(String[] args) {
		Scanner radius = new Scanner(System.in);
		System.out.print("半径r --＞ ");
		float r = radius.nextFloat();
		radius.close();
		System.out.println("円周 = "+(2*3.14*r));
		System.out.println("面積 = "+(3.14*r*r));
	}

}
