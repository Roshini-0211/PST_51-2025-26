package PST;
import java.util.Scanner;
public class AmstrongNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        int original = num;
        int sum = 0, digits = 0;

       
        int temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        
        temp = num;
        while (temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, digits);
            temp /= 10;
        }

        if (sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
        sc.close();
    }
}

	


