package jp.ac.chibafjb.x15g013.kd153;

import java.util.Scanner;

public class New153 {

	public static void main(String[] args) {
		Scanner radius = new Scanner(System.in);
		System.out.print("半径r --＞ ");
		float r = radius.nextFloat();
		radius.close();
		System.out.println("円周 = "+(Math.round(2*3.14*r*10)/10.0f));
		System.out.println("面積 = "+(Math.round(3.14*r*r*10)/10.0f));

	}

}
