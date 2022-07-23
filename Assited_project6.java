package Assignments;
import java.util.*;

public class Assited_project6 {

	public static void main(String[] args) {
		// map
		
		//Hashmap
		HashMap<Integer,String> a=new HashMap<Integer,String>();      
	      a.put(1,"Rajesh");    
	      a.put(2,"shankar");    
	      a.put(3,"mohan");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:a.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> tab=new Hashtable<Integer,String>();  
	      
	      tab.put(4,"santhosh");  
	      tab.put(8,"Mahi");  
	      tab.put(6,"motta");  
	      tab.put(7,"rithick");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:tab.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> tree=new TreeMap<Integer,String>();    
	      tree.put(8,"Nishi");    
	      tree.put(9,"indhu");    
	      tree.put(10,"Ap");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:tree.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}

