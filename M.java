package assinments2;

public class M {

	private int a=1000;
	
	long l=1000;
	
	protected float f = 88.77f;
	

	
	public void methodPublic(){  
		methodPrivate();
	}
	
	void methodDefault(){   
		methodPrivate();
	}
	
	private void methodPrivate(){     
		System.out.println("class M:method public");
		System.out.println("Value of private value a"+ a);
		System.out.println("Value of long"+ l);
		System.out.println("value of float "+f);
	}
}
