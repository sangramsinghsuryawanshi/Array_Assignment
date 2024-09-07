package array.assignmet.previous;

import java.util.Scanner;

public class FindMiddleEleThatGreaterThanLeftAndRightSide {
	
	public int[] uniqueArr(int a[]) {
		for(int i=1;i<a.length;i+=2)
		{
			if(a[i]<a[i+1]) {
				int t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
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
		FindMiddleEleThatGreaterThanLeftAndRightSide f = new FindMiddleEleThatGreaterThanLeftAndRightSide();
		int t[]=f.uniqueArr(a);
		System.out.print("\nGiven array element is: ");
		for(int i=0;i<t.length;i++)
		{
			System.out.print(t[i]+" ");
		}
	}
}
