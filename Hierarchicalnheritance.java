package PST;

public class Hierarchicalnheritance {
	public static void main(String[]args) {
		
		Animal obj=new Animal();
		obj.Animal();
		Cat obj1=new Cat();
		obj1.Cat();
	}

}
class Animal{
	void Animal(){
		System.out.println("this is animal  ");
		
	}
	
}
class Cat extends Animal{
	public void Cat() {
		System.out.println("this is cat ");
	}
	
}
class Dog extends Animal{
	public void Dog() {
		System.out.println("this is dog ");
	}
	
}
class Cow extends Animal{
	public void Cow() {
		System.out.println("this is Cow ");
	}
}