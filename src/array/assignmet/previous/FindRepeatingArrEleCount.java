package array.assignmet.previous;

import java.util.Scanner;

public class FindRepeatingArrEleCount {
	public void repeatingCount(int a[],Scanner sc) {
		System.out.print("Enter k repeating value: ");
		int k= sc.nextInt();
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==k) {
				c++;
			}
		}
		System.out.println("Given repeating element count is: "+c);
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
		FindRepeatingArrEleCount f = new FindRepeatingArrEleCount();
		f.repeatingCount(a,sc);
	}
}
