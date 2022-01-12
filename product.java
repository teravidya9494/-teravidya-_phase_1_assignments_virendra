package assinments;

public class product {
	int id =78;
	String name ="amul";
	
	void display()
	{	
	System.out.println("id:" + id);
	System.out.println("name:" + name);
	} 
}  

class A extends product{  
	
	int count = 50;
	String category="butter";
	
	void display()
	{
		System.out.println("count: " + count);
		System.out.println("Category: " + category );
	}  
}  

class B extends product{  
	
	int count = 90;
	String category="milk";
	
	void display()
	{
		System.out.println("count: " + count);
		System.out.println("Category: " + category );
	}  
} 

class C extends product{  

int count = 50;
String category="butter";

void display()
{
	System.out.println("count: " + count);
	System.out.println("Category: " + category );
}  
}

class subA extends A{  

int price=30;

void display()
{
	System.out.println("total price : " + count*price);
	System.out.println("id:" + id);
	System.out.println("name:" + name);
	System.out.println("Category: " + category );
}  
} 

class subB extends B{  

int  price=10;

void display()
{
	System.out.println("total price : " + count*price);
	System.out.println("id:" + id);
	System.out.println("name:" + name);
	System.out.println("Category: " + category );
}  

}
