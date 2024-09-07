package array.assignmet.previous;

import java.util.Scanner;

public class ReplaceArrEleWithProductOfEachEle {
	public int productOfEachEle(int a[]) {
		System.out.print("Given array element is: ");
		int p=1;
		for(int i=0;i<a.length;i++) {
			p=1;
			for(int j=0;j<a.length;j++) {
				if(i!=j) {
					p*=a[j];
				}
			}
			System.out.print(p+" ");
		}
		
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
		ReplaceArrEleWithProductOfEachEle f = new ReplaceArrEleWithProductOfEachEle();
		f.productOfEachEle(a);
	}

}
