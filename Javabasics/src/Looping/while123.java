package Looping;

public class while123 {
  static void reversenumber(int num) {
	  int rev =0;
	  System.out.println("actual number="+num);
	  while(num!=0) {
		  int rem=num%10;
		  rev=rev*10+rem;
		  num=num/10;
        
	  }
	 System.out.println("reverse number="+rev);
  }
	public static void main(String[] args) {
     while123.reversenumber(123);
	}

}
