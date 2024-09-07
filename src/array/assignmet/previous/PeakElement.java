package array.assignmet.previous;

import java.util.Scanner;

public class PeakElement {
	public int[] findPeak(int a[]) {
		System.out.print("\nGiven peak element which is not smaller than its neighbours is: ");
		for(int i=1;i<a.length;i++) {
			if(a[i]>a[i-1] && a[i]>a[i+1]) {
				System.out.print(a[i]+" ");
			}
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.print("Enter array element: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		PeakElement f = new PeakElement();
		f.findPeak(a);
		//System.out.println("Given maximum diffrence between two Integers: "+t);
	}

}
