package PST;

public class Polymorphism {

	public static void main(String[] args) {
		
		xxx();

	}
	public static void xxx() {
		System.out.println( "the character is "+Name());
		System.out.println("the number is "+add());

	}
	public static String Name() {
		String charcter="hello";
		
		return charcter;
	}
	public  static int  add() {
		int id=123,id1=234;
		int sum=id+id1;
		return sum;
		
	}

}
