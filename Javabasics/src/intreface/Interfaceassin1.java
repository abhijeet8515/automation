package intreface;
class program{
	void palindrom(int num,int rev) {
		int temp=num;
		System.out.println("Actual Number: "+num);
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}if(temp==rev) {
			System.out.println("the given number "+temp+ " palindrom");
		}else {
			System.out.println("the given number "+temp+ " not palindrom");
		}
	}
	void reversno(int num,int rev) {
		System.out.println("Actual Number: "+num);
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("reverse number is "+rev);
	}
	void leapyear(int year) {
		if(((year % 4 == 0) && ( year % 100 != 0))||( year % 400 == 0)) {
			System.out.println("year "+year+" is leap year ");
		}else {
			System.out.println("year "+year+" is comman year ");
	}
}
}
	class overiding extends program{
		
		void palindrom(int num,int rev) {
			super.leapyear(2016);
		}
		void reversno(int num,int rev) {
		}
		void leapyear(int year) {
			
		}
		void leapyear() {
			int y=2020;
			System.out.println("this yesr is leap year "+y);
		}
	
	}
public class Interfaceassin1 {

	public static void main(String[] args) {
		program m1=new overiding();
		m1.palindrom(124,0);
		m1.reversno(15134, 0);
		m1.leapyear(2015);

	}
}

