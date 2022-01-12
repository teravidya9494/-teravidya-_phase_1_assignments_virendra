package assinments;
class Hello{
	 
	synchronized public void getLine(){
	
		System.out.println("running thread name is:"+Thread.currentThread().getName()); 
		System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState()); 
		System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive());
		System.out.println("The thread id is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getId());
	
	for(int i=1;i<3;i++)
	{  
		    try{
		    	Thread.sleep(2000);
		    }
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    }  
		    System.out.println(Thread.currentThread().getName()+ "  :"+ i);  
		  }  
	
	
	}
}  

class Demo extends Thread{
	
	Hello line;

	Demo (Hello line)
	{
		this.line = line;
	}

	
	public void run() {
	     
		line.getLine();
	}
}

public class Synchronize{
	public static void main(String[] args) {
	
		Hello obj =new Hello();
		
		Demo t1=new Demo(obj);  
	 
		Demo t2=new Demo(obj);  
		  
		Demo t3=new Demo(obj); 
		 
			
	        t1.setName("IT");
			t2.setName("Finance");
			t3.setName("Hr");
		   
		  t1.start();
		  
		  t2.start();  
		  t3.start();
		  
	}
	}
