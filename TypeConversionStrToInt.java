package PST;
import java.util.Scanner;
public class TypeConversionStrToInt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str=sc.next();
		int num=Integer.parseInt(str);
		System.out.println("The Integer is "+num);

	}

}
