package Abstract;

abstract class abs{
	//global variable
	//constructor
	//normal or non abstract or concrete method
	//abstract method
	
}
abstract class abs1{
	//abstract method
	abstract void call1();
	abstract void call2();
//non abstract method
	void display() {
	}
}
abstract class abs2{
	//abstract method
	abstract void call1();
	abstract void call2();
}
abstract class abs3{
	//non abstract method
	void display() {
	}
}
public class Demoabstract extends abs2{
	void call1(){
		System.out.println("hello1");
	}
	void call2() {
		System.out.println("hello2");

	}
	public static void main(String[] args) {
		Demoabstract d1=new Demoabstract();
		d1.call1();
		d1.call2();
	}

}
