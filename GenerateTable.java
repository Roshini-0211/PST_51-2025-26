package PST;
import java .util.Scanner;
public class GenerateTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Table no : ");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
		sc.close();
	}

}
