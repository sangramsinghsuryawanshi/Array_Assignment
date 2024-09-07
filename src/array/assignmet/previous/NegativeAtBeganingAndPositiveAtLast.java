package array.assignmet.previous;
import java.util.Scanner;
public class NegativeAtBeganingAndPositiveAtLast {
	public void changePosition(int a[],int size) {
		int b[]=new int[size];
		int x=0,y=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				b[x]=a[i];
				x++;
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				b[x++]=a[i];
			}
		}
		for(int i=0;i<b.length;i++) {
			a[i]=b[i];
		}
		System.out.print("Given Re-arrange element is: ");
		for(int i=0;i<b.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.print("Enter array element: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		NegativeAtBeganingAndPositiveAtLast f = new NegativeAtBeganingAndPositiveAtLast();
		f.changePosition(a,size);
	}
}
