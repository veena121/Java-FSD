package Phase1;
import java.util.*;

public class Collection {
      public static void main(String[] args) {
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Jalgaon");//
	      city.add("Chopda");    	   
	      System.out.println(city);  
	
		
		//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Swati");  
	      names.add("Pravin");  	      
	      Iterator<String> itr=names.iterator();  
	       while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	     //creating vector
		      System.out.println("\n");
		      System.out.println("Vector");
		      Vector<Integer> vec = new Vector();
		      vec.addElement(100); 
		      vec.addElement(58); 
		      System.out.println(vec);
		      
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(111);  
	       set.add(222);  
	       set.add(333);
	       set.add(444);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(66);  
	       set2.add(23);  
	       set2.add(88);
	       set2.add(32);	       
	       System.out.println(set2);
	      	} 
	      }  
	}





