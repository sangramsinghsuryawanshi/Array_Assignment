package array.assignmet.previous;

import java.util.Random;
import java.util.Scanner;

public class ShuffleArrEle {
	
	public int[] shuffleArr(int a[]) {
		Random r = new Random();
		for(int i=0;i<a.length;i++) {
			int ind=r.nextInt(a.length);
			int t=a[i];
			a[i]=a[ind];
			a[ind]=t;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.print("Enter array element: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		ShuffleArrEle f = new ShuffleArrEle();
		int t[]=f.shuffleArr(a);
		System.out.print("\nGiven Shuffle array element is: ");
		for(int i=0;i<t.length;i++)
		{
			System.out.print(t[i]+" ");
		}
	}

}
