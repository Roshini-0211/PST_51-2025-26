package PST;

public class NonStaticClassMethod {

	public static void main(String[] args) {
		CseC obj=new CseC();
		obj.anu();
		obj.Kasthuri();
		obj.abi();
		Cse4 obj1=new Cse4();
		obj1.kasthuri();
		Cse5 obj2 =new Cse5();
		obj2.rocks();
		

	}

}
class  CseC{
	public  void anu(){
		System.out.println("anu is my classmate ");
	}
	public  void Kasthuri(){
		System.out.println("kasthuri is my deskmate ");
	}
	public  void abi(){
		System.out.println("abi is my classmate ");
	}
	public  void amutha(){
		System.out.println("amutha is my classmate ");
	}
		
}
 class Cse4{ 
	 public  void kasthuri(){
			System.out.println("kasthuri is my friend now ");
		}
	 public  void abi(){
			System.out.println("abi is another class ");
		}
	
}
class Cse5{
	public  void rocks(){
		System.out.println("rocks is my friend ");
	}
	
	
}
