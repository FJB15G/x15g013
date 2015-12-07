package jp.ac.chibafjb.x15g013.kd171;

public class New171 {

	public static void main(String[] args) {
		int data[] = {100,200,300,0};
		int k = 3;
		for(int i=0;i<k;i++)
			data[data.length-1-i] = data[data.length-2-i];
		for(int i=0;i<k+1;i++)
			System.out.println("data["+i+"] = "+data[i]);

	}

}