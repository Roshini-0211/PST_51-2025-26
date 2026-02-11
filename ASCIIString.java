package PST;
import java.util.Scanner;
public class ASCIIString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=sc.nextLine();
		string(str);

	}
	public static void string(String str1) {
		for(int i=0;i<str1.length();i++) {
			char ch=str1.charAt(i);
			System.out.println("the string is  " +str1+" is "+(int)ch);
		}
		
	}

}

