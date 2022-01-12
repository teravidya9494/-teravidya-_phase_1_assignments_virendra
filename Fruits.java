package assinments;

import java.util.HashSet;

 class Fruits {
	 public static void main(String[] args){
			
			//LinkedHashSet<String> hs=new LinkedHashSet<String>();
			HashSet<String> hs=new HashSet<String>();
			
			hs.add("orange");
			hs.add("straberry");
			hs.add("watermelon");
			hs.add("guava");
			hs.add("pinapple");
			hs.add("grapes");
			hs.add("kiwi");
			hs.add("banana");
			hs.add("apple");
			hs.add("plum");
			
			System.out.println("Hashset is "+hs);
			System.out.println("Size of Hashset is "+ hs.size());
			System.out.println("remove the element "+hs.remove("apple,kiwi"));
			System.out.println("add the element "+hs.add("hgf,dss"));
			System.out.println("Hashset is "+hs);
			System.out.println("Size of Hashset is "+ hs.size());
			System.out.println("Does hashset contains this 'orange' element  " + hs.contains("orange"));		
			System.out.println("is hashset empty  " + hs.isEmpty());
			
			
			
		    hs.clear();
		    System.out.println("get class  " +hs.getClass());
			
		    System.out.println("is hashset empty  " +hs.isEmpty());
		    
		    
			
		}
	}

