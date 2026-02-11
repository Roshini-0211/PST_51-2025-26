package PST;

public class ASCIITableNO {

	public static void main(String[] args) {
		PrintUpper();
		Printlower();
	}
	public static void PrintUpper() {
		System.out.println("the number of upper case");
		for(int num=65;num<=90;num++) {
			char character=(char)num;
			System.out.println(num+"="+character);
		}
	}
	public static void Printlower() {
		System.out.println("the number of lower case");
		for(int num=97;num<=122;num++) {
			char character=(char)num;
			System.out.println(num+"="+character);
		}
	}

}
