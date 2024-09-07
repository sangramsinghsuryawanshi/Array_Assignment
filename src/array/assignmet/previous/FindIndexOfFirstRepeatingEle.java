package array.assignmet.previous;
import java.util.Scanner;

public class FindIndexOfFirstRepeatingEle {

	public void repeatingIndexEle(int a[]) {
		System.out.print("Given array element is: ");
		int findex=-1;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					if(findex==-1) {
						findex=i;
					}
				}
			}
			if(i==findex) {
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
		FindIndexOfFirstRepeatingEle f = new FindIndexOfFirstRepeatingEle();
		f.repeatingIndexEle(a);
	}
}

