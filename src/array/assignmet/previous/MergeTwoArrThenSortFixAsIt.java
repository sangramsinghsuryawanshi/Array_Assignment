package array.assignmet.previous;
import java.util.Arrays;
import java.util.Scanner;
public class MergeTwoArrThenSortFixAsIt {
	public void mergeArr(int a[],int b[],int[]c,int size,int size1) {
		int c2=0,c1=0;
		for(int i=0;i<c.length-3;i++) {
			a[i]=c[i];
			c2++;
		}
		for(int i=c.length-3;i<c.length;i++) {
			b[c1++]=c[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 array size: ");
		int size = sc.nextInt();
		int size1 = sc.nextInt();
		int a[] = new int[size];
		int b[]=new int [size1];
		int c[]=new int [a.length+b.length];
		System.out.print("Enter 1 given array element: ");
		int c1=0;
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			c[i]=a[i];
			c1++;
		}
		System.out.print("Enter 2 given array element: ");
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
			c[c1]=b[i];
			c1++;
		}
		Arrays.sort(c);
		MergeTwoArrThenSortFixAsIt f = new MergeTwoArrThenSortFixAsIt();
		f.mergeArr(a,b,c,size,size1);
	}
}

