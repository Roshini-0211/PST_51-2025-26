package PST;

public class EvenOdd {

	public static void main(String[] args) {
		int[] numbers= {10,20,30,40,50,70,1,3};
		int evencount =0;
		int oddcount=0;
		for (int number:numbers) {
			if (number %2==0) {
				evencount++;
			}else {
				oddcount++;
			}
		}
		System.out.println("Number is even number "+evencount)	;
		System.out.println("Nmumber is od number "+oddcount) ;
	}

}
