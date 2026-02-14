package PST;

public class MethodOverriding {

	public static void main(String[] args) {
	ClassB obj=new ClassB();
	obj.CSE();
		

	}

}
 class ClassA{
	 public   void CSE() {
		 System.out.println("Hello I am in CSE");
		 
	 }
	
}
 class ClassB extends ClassA{
	 
	 public  void  CSE() {
		 System.out.println("Hello! you are  welcome");
		 
	 }
	 
 }
 
