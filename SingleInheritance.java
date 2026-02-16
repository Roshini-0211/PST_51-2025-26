package PST;

public class SingleInheritance {

	public static void main(String[] args) {
		
A obj=new A();
obj.cat();
	}

}
class A{
	public void cat() {
		System.out.println("This is Cat");
	}
	
	
}
class B extends A{
	public static void Dog() {
		System.out.println("This is Dog");
	}
}


