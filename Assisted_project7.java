package Assignments;

public class Assisted_project7{  
 private int data=30;  
 class Inner{  
  void msg(){System.out.println("data is "+data);}  
 }  
 public static void main(String args[]){  
	 Assisted_project7 obj=new Assisted_project7();  
	 Assisted_project7.Inner in=obj.new Inner();  
  in.msg();  
 }  
}  
