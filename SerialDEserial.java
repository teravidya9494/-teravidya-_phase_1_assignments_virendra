package assinments;

public class SerialDEserial {
	    public static void main(String args[]) throws IOException 
		  {
		    employee obj1= new employee(101, 25, "Vidya", "Kadapa","F",7878);
		    employee obj2 = new employee(111, 125, "Ammu", "Lingala","F",4566);
		    FileOutputStream fos= null;
		    ObjectOutputStream oos= null;
		    
		    try{ 
		      fos = new FileOutputStream("C://java_program//New folder.ser"); 
		      oos = new ObjectOutputStream(fos);
		      oos.writeObject(obj1);
		      oos.writeObject(obj2);
		      System.out.println("Serialzation Done!!");
		   }
		    catch(IOException ioe)
		    {
		      System.out.println(ioe);
		    }
		    finally{
			      oos.close();
			      fos.close();
		    }
	    
	    //Deserialization
		    
	    employee o1=null;
	    employee o2=null;
	    try{
	      FileInputStream fis = new FileInputStream("C://java_program//New folder//Employee.ser");
	      ObjectInputStream ois = new ObjectInputStream(fis);
	      o1 = (employee)ois.readObject();
	      o2 = (employee)ois.readObject();
	      ois.close();
	      fis.close();
	    }
	    catch(IOException ioe)
	    {
	       ioe.printStackTrace();
	       return;
	    }catch(ClassNotFoundException cnfe)
	     {
	       System.out.println("Student Class is not found.");
	       cnfe.printStackTrace();
	       return;
	     }
	    System.out.println("Employee Name:"+o1.getStuName());
	    System.out.println("Employee Age:"+o1.getStuAge());
	    System.out.println("Employee ID:"+o1.getStuRollNum());
	    System.out.println("Employee Gender"+o1.getGender());
	    System.out.println("Employee Address:"+o1.getStuAddress());
	    System.out.println("Employee Phn no:"+o1.getPhno());
	    
	    System.out.println("Employee Name:"+o2.getStuName());
	    System.out.println("Employee Age:"+o2.getStuAge());
	    System.out.println("Employee ID:"+o2.getStuRollNum());
	    System.out.println("Employee Gender"+o2.getGender());
	    System.out.println("Employee Address:"+o2.getStuAddress());
	    System.out.println("Employee Phn no:"+o2.getPhno());
	 }
	}

	//------------------------------Student-------------------------//
	class employee implements java.io.Serializable{
		  
		  private int EmpId;
		  private int EmpAge;
		  private String EmpName;
		  private String stuAddress;   
		  private String Gender;
		  private transient int Phnno;
		 
		  
		  public employee(int ID , int age, String name,String address,String Gender,int Phnno) {
		    this.EmpId = ID;
		    this.EmpAge = age;
		    this.EmpName = name;
		    this.stuAddress = address;
		    this.Gender=Gender;
		    this.Phnno=Phnno;
		  }
		  
		public int getStuRollNum() {
		    return EmpId;
		  }
		  public void setStuRollNum(int stuRollNum) {
		    this.EmpId = stuRollNum;
		  }
		  public int getStuAge() {
		    return EmpAge;
		  }
		  public void setStuAge(int stuAge) {
		    this.EmpAge = stuAge;
		  }
		  public String getStuName() {
		    return EmpName;
		  }
		  public void setStuName(String stuName) {
		    this.EmpName = stuName;
		  }
		  public String getStuAddress() {
		    return stuAddress;
		  }
		  public void setStuAddress(String stuAddress) {
		    this.stuAddress = stuAddress;
		  }
		  public int getPhno() {
		    return Phnno;
		  }
		  public void setStuHeight(int Phnno) {
		    this.Phnno = Phnno;
		  }
		  public String getGender() {
			    return Gender;
			  }
			  public void setGender(String Gender) {
			    this.Gender = Gender;
			  }
		}
