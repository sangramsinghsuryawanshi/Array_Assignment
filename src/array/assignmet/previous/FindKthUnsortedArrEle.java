package array.assignmet.previous;

import java.util.Arrays;
import java.util.Scanner;

public class FindKthUnsortedArrEle {
	public int [] kthArrEle(int a[],int k) {
		System.out.print("\nGiven Kth array element is: ");
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			if((i+1)==k) {
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
		System.out.print("Enter k value: ");
		int k = sc.nextInt();
		int a[]=new int[size];
		System.out.print("Enter array element: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		FindKthUnsortedArrEle f = new FindKthUnsortedArrEle();
		f.kthArrEle(a,k);
	}

}
