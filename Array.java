package PST;
import java .util.Scanner;
public class Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size : ");
		int size =sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter "+size+" Number : ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements are :5 ");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]+" ");
		}
		// TODO Auto-generated method stub
sc.close();
	}

}
