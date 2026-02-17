package PST;
import java.util.Scanner;
public class UsingScannerPolymorphism {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value 1 : ");
		int value1=sc.nextInt();
		System.out.println("Enter the value 2 : "); 
		int value2=sc.nextInt();
		System.out.println("The Addition of 2 values "+add(value1,value2));

	}
	public static int add(int a,int b) {
		return a+b;
	}

}
