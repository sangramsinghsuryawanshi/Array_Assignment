package array.assignmet.previous;

import java.util.Scanner;

public class FindMaxDiffBtweenTwoInt {
	public int maxDiffrence(int a[]) {
		int max=0,smin=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<smin) {
				smin=a[i];
			}
		}
		int p=max-smin;
		return p;
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
		FindMaxDiffBtweenTwoInt f = new FindMaxDiffBtweenTwoInt();
		int t=f.maxDiffrence(a);
		System.out.println("Given maximum diffrence between two Integers: "+t);
	}

}
