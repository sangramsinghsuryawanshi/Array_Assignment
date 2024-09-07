package array.assignmet.previous;

import java.util.Arrays;
import java.util.Scanner;

public class ZeroFirstOneSndTwoTirdAscendingArrEle {

	public void asendingEle(int a[]) {
		System.out.print("Given array element is: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
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
		Arrays.sort(a);
		ZeroFirstOneSndTwoTirdAscendingArrEle f = new ZeroFirstOneSndTwoTirdAscendingArrEle();
		f.asendingEle(a);
	}
}

