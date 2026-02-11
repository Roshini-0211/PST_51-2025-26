package PST;

import java.util.Scanner;

public class ASCIIValue {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		 System.out.println("Enter value : ");
		 int value=sc.nextInt();
		 AsciiCharacter(value);
	}


static void AsciiCharacter(int a) {
	char r=(char)a;
	System.out.println("The character of ascii value " + a +" is "+r);
}
}
