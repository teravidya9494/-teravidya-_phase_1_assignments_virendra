package assinments;

public class Funoverloding {
	 public int calc(int i,int j) {
		 int add=i+j;
		 return add;
	 }
	 public double calc(double r) {
		 double area=2*3.4*r;
		 return area;
	 }
	 public int calc1( int a,int b) {
		 int area1=a*b;
		 return area1;
	 }
		 
	 public static void main(String [] args) {
		 Funoverloding s=new  Funoverloding();
		 System.out.println("Addition of two numbers : " + s.calc(11,30));
		 System.out.println("Area of Circle: " + s.calc(7.87));
		 System.out.println("Area of Rectangle :" +s.calc1(4,6));
	 }
}
