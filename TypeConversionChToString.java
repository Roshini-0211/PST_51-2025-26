package PST;
import java.util.Scanner;
public class TypeConversionChToString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  a Character : ");
		char ch=sc.nextLine().charAt(0);
		
		ChartoStr(ch);

	}
	public static void ChartoStr(char str1) {
		String str=""+str1;
		System.out.println("The character covert to string : "+str);
		System.out.println("Length os New string is : "+str.length());
		
	}

}
