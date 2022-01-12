package assinments;

public class Member_Inner {
private int data=50;  
	
	void display(){
		System.out.println("i am inside the outer class method");
	}
	 
	class Inner{  		
	 private int data=40;
	  
	  void msg()
	  {
		  Member_Inner.this.display();
		  System.out.println("data is "+data);
	  }  
	  
	  // calling the duplicate method of the outer class
	  void display(){
		  System.out.println("i am inside the inner class method");
	  }// inner class accessing the outside private variable
	 
	  void classA(){
		  System.out.println("i am vidya");
	  }
	}  
	
	public static void main(String args[]){  
	  
	  Member_Inner obj=new Member_Inner();     // creating object of Outer class
	  
	  Member_Inner.Inner in=obj.new Inner(); 
	  //Inner.classA in=obj.new classA();
	  Member_Inner.Inner A =obj.new Inner(); 
	  in.classA();
	  in.msg();  
	  in.display(); 
	 } 

}
