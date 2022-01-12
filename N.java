package assinments2;

public class N {
protected long l2=23030;
	
	public int a2=200;
	
	double d2= 445.999;
	
	public void methodPublic(){     
		methodPrivate();
	}
	
	protected void methodProtected(){  
		methodPrivate();
	}
	
	void methodDefault(){   
		methodPrivate();
	}
	
	private void methodPrivate(){     
		System.out.println("class N:method public");
		System.out.println("Value of long l2 "+ l2);
		System.out.println("Value of int a2 "+ a2);
		System.out.println("value of double d2 "+ d2);
	}
}
