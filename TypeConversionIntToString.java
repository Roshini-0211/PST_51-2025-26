package PST;
import java.util.Scanner;
public class TypeConversionIntToString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		
	
	String str=String.valueOf(num);
	System.out.println("String of "+str);

	}

}
