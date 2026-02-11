package PST;

public class ASCIITable {

	public static void main(String[] args) {
		Printuppercase();
		Printlowercase();
	}
	public static   void Printuppercase() {
		System.out.println("Upper case of ASCII Value : ");
		for(char ch='A';ch<='Z';ch++) {
			int value= (int)ch;
			System.out.println(ch+"="+value);
		}
	}
	public static   void Printlowercase() {
		System.out.println("Lower case of ASCII Value : ");
		for(char ch='a';ch<='z';ch++) {
			int value=ch;
			System.out.println(ch+"="+value);
		}
	}

}
