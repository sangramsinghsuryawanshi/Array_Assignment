package array.assignmet.previous;

import java.util.Scanner;

public class MajorityArrEle {

	public void findMajority(int a[],int size) {
		System.out.print("Given majority array element is: ");
		int temp=0;
		for(int i=1;i<a.length;i++) {
			temp=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					temp++;
				}
			}
			if(size/2==temp) {
				System.out.println(a[i]+" ");
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
		MajorityArrEle f = new MajorityArrEle();
		f.findMajority(a,size);
	}
}

