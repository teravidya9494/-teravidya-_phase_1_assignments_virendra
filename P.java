package assinments2;

public class P {
	public static void main(String args[]) {
		
		new M().methodDefault();	
		
        new N().methodPublic();
		new N().methodProtected();
		new N().methodDefault(); 
		
			
	}
	

	public void methodPublic() {
		System.out.println("Class : methodPublic");
	}

	protected void methodProtected() {
		System.out.println("Class: methodProtected");
		
	}

	void methodDefault() {
		System.out.println("Class: methodDefault");
	}

}
