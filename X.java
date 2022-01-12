package assinments22;

public class X {
long l4 =272;
	
	protected float ff=33334.233f;
	
	public char h='h';
	
	private int n = 45;
	

	protected void methodProtected(){  
		methodPrivate();
	}
	
	void methodDefault(){   
		methodPrivate();
	}
	
	private void methodPrivate(){     
		System.out.println("class X:method public");
		System.out.println("Value of int"+ n);
		System.out.println("Value of long"+ l4);
		System.out.println("value of char "+h);
		System.out.println("value of float "+ff);
		
	}
}
