package Looping;

public class while1234 {
     static void checkarmstrongnum(int num) {
    	 int temp,rem;
    	 double res=0;
    	 temp=num;
    	 while(num!=0) {
    		 rem=num%10;
    		 res=res+Math.pow(rem,3);
    		 num=num/10;
    	 }
    	 if(res==temp) {
    		 System.out.println("given no is armstrong number");
    	 }
    	 else {
    		 System.out.println("given no is not armstrong number");
    	 }
     }
	public static void main(String[] args) {
		while1234.checkarmstrongnum(123);

	}

}
