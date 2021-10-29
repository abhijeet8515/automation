package Objectclass;
class dabar{
	int i;
	dabar(int i){
		System.out.println(i);
		this.i=i;
	}
		public boolean equalmethod(Object j) {
			dabar b=(dabar)j;
			return (this.i==b.i);
		}	
	}
public class objequal {
	public static void main(String[] args) {
		dabar d2=new dabar(123);
		System.out.println(d2);
		dabar d3=new dabar(123);
		System.out.println(d3);
		System.out.println(d2==d3);
		System.out.println(d2.equals(d3));
		

		
		
		
		
		
		
	}
}
