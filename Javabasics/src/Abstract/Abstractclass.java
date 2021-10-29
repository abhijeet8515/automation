package Abstract;
//Abstract class
abstract class Animal{
	//abstract method (does not have body)
	public abstract void animalsound();
	//regular method
	public void sleep() {
		System.out.println("Zzz");
	}
}
//subclass (inherit from animal)
class pig extends Animal{
	public void animalsound() {
		//the body of animal provided here
		System.out.println("the pig says :wee wee");
	}
}
//subclass (inherit from animal)
class dog extends Animal{
	public void animalsound() {
		//the body of animalsound() is provided here
		System.out.println("the dog says : bow bow");
	}
}
public class Abstractclass {
	public static void main(String[] args) {
		pig mypig =new pig();  //creat a pig obj
		mypig.animalsound();
       mypig.sleep();
       dog mydog =new dog();
       mydog.animalsound();
       mydog.sleep();
	}

}
