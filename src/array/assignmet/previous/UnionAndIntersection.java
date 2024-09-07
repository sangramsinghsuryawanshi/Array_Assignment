/*
 * Q9.Union and Intersection of two sorted arrays
Input: arr1[] = {1, 3, 4, 5, 7}
        arr2[] = {2, 3, 5, 6} 
Output: Union : {1, 2, 3, 4, 5, 6, 7} 
         Intersection : {3, 5}

Input: arr1[] = {2, 5, 6}
        arr2[] = {4, 6, 8, 10} 
Output: Union : {2, 4, 5, 6, 8, 10} 
         Intersection : {6}

 */
package array.assignmet.previous;

import java.util.Arrays;
import java.util.Scanner;

public class UnionAndIntersection {
	public void unionAndInterArrEle(int a[],int[]b,int size,int size1) {
		int c[]=new int[a.length+b.length];
		int x=0,y=0;
		for(int i=0;i<a.length;i++) {
				c[i]=a[i];
				x++;
		}
		for(int i=0;i<b.length;i++) {
				c[x]=b[i];
				x++;
		}
		Arrays.sort(c);
		System.out.print("Intersection of array element is: ");
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					if(c[i]!=-1) {
						System.out.print(c[i]+" ");
					}
					if(c[i]==c[j]) {
						c[j]=-1;
					}
				}
			}
		}
		System.out.print("\nUnion of array element is: ");
		for(int i=0;i<c.length;i++) {
			if(c[i]!=-1)
			System.out.print(c[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of two array: ");
		int size = sc.nextInt();
		int size1 = sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size1];
		System.out.print("Enter 1 array element: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Enter 2 array element: ");
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		UnionAndIntersection f = new UnionAndIntersection();
		f.unionAndInterArrEle(a,b,size,size1);
	}
}
