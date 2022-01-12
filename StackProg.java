package assinments;

import java.util.Stack;

public class StackProg {
	public static void main(String[] args)
	{

	Stack stack1 = new Stack();

       // pushing the elements
	    stack1.push("apple");
	    stack1.push("banana");
	    stack1.push("mango");
	    stack1.push("orange");
	    stack1.push("watermelon");
	    stack1.push("kadapa");
	    stack1.push("delhi");
	    stack1.push("hyderabad");
	    stack1.push("bangalore");
	    stack1.push("11");
	    stack1.push("22");
	    stack1.push("55");
	    stack1.push("13");
	    stack1.push("v");
	    stack1.push("a");
	     
	   
	    System.out.println(stack1);
	   
	    stack1.pop();
	    stack1.pop();
	    stack1.pop();
	    stack1.pop();
	    stack1.pop();
	   
	    System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek());
	   
	    stack1.pop();
	    stack1.pop();
	   
	    System.out.println("after removing 2 elements"+ " stack-1 is: " + stack1.peek());
	   
	    System.out.println("index of elemtn  inside the stack "+ stack1.indexOf("apple"));
	    System.out.println("index of elemtn  inside the stack "+ stack1.indexOf("delhi"));
	         
	}
	}
