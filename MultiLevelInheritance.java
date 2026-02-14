package PST;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		 Animal obj=new Animal();
		obj.cat();
		Dog obj2=new Dog();
		obj2.Dog();
		Cow obj1=new Cow();
		obj1.Cow();
         
	}

}
class Animal{
	public static  void cat() {
		System.out.println("This is Cat");
	}
	
}
class Dog extends Animal{
	public void Dog() {
		System.out.println("This is Dog");
	}
	
}
class Cow extends Dog{
	public void Cow() {
		System.out.println("This is Cow");
		
	}
	
}