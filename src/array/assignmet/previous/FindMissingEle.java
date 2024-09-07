package array.assignmet.previous;

import java.util.Scanner;

public class FindMissingEle {

	public void missingEle(int a[],int size) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		int ele=size*(size+1)/2;
		System.out.println("Given missing array element is: "+(ele-sum));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size-1];
		System.out.print("Enter array element: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		FindMissingEle f = new FindMissingEle();
		f.missingEle(a,size);
	}
}

