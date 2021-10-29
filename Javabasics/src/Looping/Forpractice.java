package Looping;

public class Forpractice {      
	public static void main(String[] args) {
		
		for(int a=1; a<=5; a++) {
		System.out.println("hello");
	}  
		System.out.println("..........................................");
		for(int b=1; b<=5; b++) {
			System.out.println(b);
		} 
		System.out.println("..........................................");
		for(int c=5; c>=1; c--) {
			System.out.println(c);
		} 
		System.out.println("..........................................");
		for(char d1='A'; d1<='Z'; d1++) {
			System.out.print(d1+" ");
		}  
		System.out.println("\n..........................................");
		for(char e1='Z'; e1>='A'; e1--) {
			System.out.print(e1+" ");
		}  
		System.out.println("\n..........................................");
		for(int f=0;f<20;f++) {
			System.out.print(f+" ");
			f=f+1;
		}

	
}  
}