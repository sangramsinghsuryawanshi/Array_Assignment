package array.assignmet.previous;

import java.util.Scanner;

public class FindSmallestPositiveMissingEle {

	public void positiveSmalleEle(int a[]) {
		System.out.print("Given missing positive array element is: ");
		int temp=1;
		for(int i=1;i<a.length;i++) {
			if(a[i]!=i) {
				temp=i;
				System.out.print(temp+" ");
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("Enter given array element: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		FindSmallestPositiveMissingEle f = new FindSmallestPositiveMissingEle();
		f.positiveSmalleEle(a);
	}
}

