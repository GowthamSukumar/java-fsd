package Assignments;
	class EmpInfo{
		int id;
		String name;

	void display() {
		System.out.println(id+" "+name);
		}
	}
	class Std{
		int id;
		String name;

		Std(int i,String n)
		{
		id=i;
		name=n;
		}

		void display() {
		System.out.println(id+" "+name);
		}
	}
public class Assitedproject4 {
	public static void main(String[]args)
{
	Std std1=new Std(25,"Alex");
	Std std2=new Std(10,"Annie");
	std1.display();
	std2.display();

}
}
