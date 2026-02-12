package PST;
import java .util.Scanner; 
public class Countofdigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int count=0;
		if (num<0) {
			num=-num;
		}
		if (num==0) {
			count=1;
		}else {
			while(num>0) {
				count++;
				num=num/10;
			}
		}
		System.out.println("Number of digits :"+count);
		sc.close();

	}

}
