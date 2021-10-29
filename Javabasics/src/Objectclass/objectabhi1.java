package Objectclass;
class aaba{
	void home() {
		System.out.println("print aaba home");
	}
}
class baba extends aaba{
	int roll_no=25;
	void home() {
		System.out.println("print baba home");
	}
	void door() {
		System.out.println("print baba door");
	}
	public String toString() {
		return "print baba string";
	}
	public int hashCode() {
		return roll_no;
	}
	public boolean equalmethod(Object j) {
		baba b=(baba)j;
		return (this.roll_no==b.roll_no);
	}
}
public class objectabhi1 {

	public static void main(String[] args) {
		objectabhi1 x1=new objectabhi1();
		System.out.println(x1);
		System.out.println(x1.toString());
		System.out.println(x1.hashCode());
		System.out.println(x1.equals(x1));
		System.out.println(x1==x1);
		System.out.println("*********************");
		baba b1=new baba();
		System.out.println(b1);
		System.out.println(b1.toString());
		System.out.println(b1.hashCode());
		System.out.println(b1.equals(b1));
		System.out.println(b1==b1);
		b1.door();
		b1.home();
		System.out.println("*********************");
		aaba a1=new aaba();
		System.out.println(a1);
		System.out.println(a1.toString());
		System.out.println(a1.hashCode());
		System.out.println(a1.equals(a1));
		System.out.println(a1==a1);
		a1.home();
		System.out.println("*********************");
		System.out.println(a1.equals(b1));
		System.out.println(a1.equals(x1));
		System.out.println(b1.equals(x1));
		System.out.println(a1==b1);
		aaba b2=new baba();
		System.out.println(b2);
		System.out.println(b1.equals(b2));
		System.out.println(b1==b2);

	}
}
