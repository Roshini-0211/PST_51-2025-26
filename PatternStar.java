package PST;
import java.util.Scanner;

public class PatternStar {

	public static void main(String[] args) {
		System.out.println(" Enter the Number os Stars : ");
		Scanner sc=new Scanner (System.in);
		int numr=sc.nextInt();
		Star2(numr);
		Star3(numr);
	}
	
	 static  void Star2(int num) {
		
		for (int i=0;i<num;i++) {
			System.out.println("* ");
		}
	}
	  static void Star3(int num) {
		
		for (int i=0;i<num;i++) {
			System.out.print("* ");
		}
	
	
}
}