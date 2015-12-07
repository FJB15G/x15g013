package jp.ac.chibafjb.x15g013.kd172;

public class New172 {

	public static void main(String[] args) {
		int x[] = {1,2,3};
		int y[] = {7,8};
		int z[] = new int[x.length + y.length];
		for(int i=0;i<x.length;i++)
			z[i] = x[i];
		for(int i=0;i<y.length;i++)
			z[i+ x.length] = y[i];
			System.out.print("z[] = {");
		for(int data=0;data<z.length-1;data++)
			System.out.print(z[data]+",");
		System.out.print(z[z.length-1]+"}\n");

	}

}
