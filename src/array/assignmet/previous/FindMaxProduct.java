package array.assignmet.previous;

import java.util.Scanner;

public class FindMaxProduct {

	public int maxProduct(int a[]) {
		int max=0,smax=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax && smax!=max) {
				smax=a[i];
			}
		}
		int p=max*smax;
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
		FindMaxProduct f = new FindMaxProduct();
		int t=f.maxProduct(a);
		System.out.print("Maximum Product of Two given Integer is: "+t);
	}

}
