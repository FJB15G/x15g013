package jp.ac.chibafjb.x15g013.kd164;

public class New164 {

	public static void main(String[] args) {
		int[] a = {5,10,15};
		int m = a.length;
		int[] b =new int[m];
		for(int i=0;i<m;i++){
			b[i] = a[i];
		}
		for(int i=0;i<m;i++){
			System.out.println("b["+i+"] = "+b[i]);
		}

	}

}
