package Javamethods;

import intreface.*;

public class newinterface implements Demointerface {
	public void display() {
		System.out.println("Hello");
	}
	public void disk() {
		System.out.println("Hell");
	
	}
	
	public static void main(String[] args) {
    newinterface f1=new newinterface();
    f1.display();
    f1.disk();
	}

}
