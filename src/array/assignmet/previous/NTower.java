package array.assignmet.previous;
import java.util.Scanner;
public class NTower {
	public void nTowerArr(int a[],Scanner sc) {
		System.out.print("Enter k value: ");
		int k= sc.nextInt();
		int max=0,min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(i>0) {
				a[i]-=k;
			}
			else {
				a[i]+=k;
			}
			if(a[i]>max) {
				max=a[i];
			}
			else if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Maximum difference is: "+(max-min));
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
		NTower f = new NTower();
		f.nTowerArr(a,sc);
	}
}