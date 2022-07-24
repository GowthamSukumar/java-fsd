package Assignments;
import java.util.ArrayList;
import java.util.Scanner;
public class ValidateMail {
	void valid(ArrayList<String>l)
	{
			System.out.println("Enter the mail ID: ");
			Scanner sc = new Scanner(System.in);
		      String b=sc.next();
		      int count=0;
			for(String element:l) {
		    	  if(element.equalsIgnoreCase(b)) {
		    		  count=1;
		    		  break;
		    	  }
		      }
			if(count==1)
			{
				System.out.println("Mail ID is valid");
			}
			else
			{
				System.out.println("Sorry,The given mailId is not valid");
			}
	}
		public static void main(String[] args) {
			ArrayList <String> list=new ArrayList<String>();
			  list.add("Student12@gmail.com");
		      list.add("Student13@gmail.com");
		      list.add("Student14@gmail.com");
		      list.add("Student15@gmail.com");
		      list.add("Student16@gmail.com");
		     
		      
		      ValidateMail a =new ValidateMail();
		      a.valid(list);
		    
		     
		}
}
