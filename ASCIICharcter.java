package PST;
import java.util.Scanner;
public class ASCIICharcter {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		 System.out.println("Enter Character : ");
		 
		 char ch=sc.next().charAt(0);
		 Ascii(ch);

	}



 public static  void Ascii(char a){
	 int ascii=(int)a;
	 System.out.println("the ascii value of "+a +" is : "+ascii);
	
}
}

