package PST;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	
		Scanner obj =new Scanner(System.in);
		int a =obj.nextInt();
		System.out.println("Enter the Number is  "+a);
		int  fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		System.out.println("The Factorial of the no is "+fact);
         
		// TODO Auto-generated method stub
		obj.close();

	}
	  

}


