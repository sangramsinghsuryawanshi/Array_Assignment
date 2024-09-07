package array.assignmet.previous;

import java.util.Scanner;

public class RotateArrClockWise {
	public void roatateClockWise(int a[]) {
		int temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
		}
		a[0]=temp;
		System.out.print("Given cyclically rotated array element is: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
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
		RotateArrClockWise f = new RotateArrClockWise();
		f.roatateClockWise(a);
	}
}

