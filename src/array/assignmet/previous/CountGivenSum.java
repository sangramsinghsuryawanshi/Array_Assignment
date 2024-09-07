package array.assignmet.previous;

import java.util.Scanner;

public class CountGivenSum {
	public void count(int a[],int sum) {
		int c=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]+a[i]==sum) {
					System.out.println(a[i]+" "+a[j]+" ");
					c++;
				}
			}
		}
		System.out.println("Given sum count is: "+c);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		System.out.print("Enter array sum: ");
		int sum = sc.nextInt();
		int a[]=new int[size];
		System.out.print("Enter array element: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		CountGivenSum f = new CountGivenSum();
		f.count(a,sum);
	}
}
