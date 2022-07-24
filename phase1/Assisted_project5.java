package Assignments;

import java.util.*;

public class Assisted_project5 {

	public static void main(String[] args) {
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> country=new ArrayList<String>();   
		country.add("India");//
		country.add("America");    	   
	      System.out.println(country);  
		
		//creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(5); 
	      vec.addElement(22); 
	      System.out.println(vec);
		
		//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Gowtham");  
	      names.add("Sukumar");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());
	      }
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(31);  
	       set.add(6);  
	       set.add(9);
	       set.add(13);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);	       
	       System.out.println(set2);
	      	} 
	      }  
