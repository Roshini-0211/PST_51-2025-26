package PST;

public class SameMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=2,c=3;
System.out.println(add(a,b));
System.out.println(add(a,b,c));


	}
	public static int add(int c,int d){
		return c+d;
		
	}
public static int add(int c,int d,int e) {
	return c+d+e;
}
}
