package Assignments;

public class Assitedproject3 {
	//method demo
	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
	}
	//call by value
	int val=250;
	int operation(int val) {
		val =val*10/100;
		return(val);
	}
	//method overloading
	public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }
 
    public static void main(String[] args) {
    	Assitedproject3 a= new Assitedproject3();
    	int c=a.multipynumbers(10,3);
    	System.out.println("Multipication Is"+c);
    	//call by value
    	System.out.println("Before operation value of data is "+a.val);
    	a.operation(100);
    	System.out.println("After operation value of data is "+a.val);
    	//method overloading
    	a.area(10,20);
        a.area(5); 

    	
    	}

    }

