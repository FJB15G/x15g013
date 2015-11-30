package jp.ac.chibafjb.x15g013.kd165;

public class New165 {

	public static void main(String[] args) {
		int[] a = {5,10,15};
		int m = a.length;
		int[] b =new int[m];
		for(int i=0;i<m;i++){
			b[i] = a[m-i-1];
		}
		for(int i=0;i<m;i++){
			System.out.println("b["+i+"] = "+b[i]);
		}

	}

}
