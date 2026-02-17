package PST;
import java.util.Scanner;
public class TypeConversionStoI {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=sc.nextLine();
		String1(str);
		}
		public  static void String1(String str) {
			int num=0;
			for(int i =0;i<str.length();i++) {
				char ch=str.charAt(i);
		
			num=num*10+(ch-'0');
				System.out.println("The value is "+num);
		}

	}

}
