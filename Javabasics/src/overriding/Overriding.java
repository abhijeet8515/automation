package overriding;


class company{
	void display() {
	System.out.println("i am company class display()");

	}	
}
class employee extends company{
	void display() {
	System.out.println("i am employee class display()");
	
	}	
	void callme() {
	System.out.println("i am employee class callme()");
	super.display();
	}	
}
public class Overriding {

	public static void main(String[] args) {
employee e1=new employee();
e1.display();
e1.callme();
company c1=new company();
c1.display();
//company =new employee(); 
                 
//e2.display();

	}

	
}
