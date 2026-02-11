package PST;

public class ArgumentPassingPolymorphism {

	public static void main(String[] args) {
		int a=22,b=33;
		System.out.println("The Addition is "+Add(a,b));
		System.out.println("The Subtraction is"+Sub(a,b));
		System.out.println("The Division is "+Div(a,b));
		System.out.println(" The Multiplication is "+Mul(a,b));

	}


public static int Add( int c,int d) {
	return c+d;
	}
public static int Sub( int c,int d) {
	return c-d;
	}
	public static  int  Div(int m ,int l) {
	return m/l;
	}
	public static int Mul( int c,int d) {
		return c*d;
	}

}