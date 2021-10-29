package singletone;
class single1{
	
     private single1(){
		System.out.println("print single1 constructor");
	}
 	static single1 s1=new single1();

	 String name="Same To You";
	static single1 getsingle(){
		return s1;
	}
	void data() {
		System.out.println("print data ");
	}
}

public class singleton1 {
	public static void main(String[] args) {
		single1 s1=single1.getsingle();
		s1.data();
		System.out.println("s1 ="+s1.name);
		s1.name=(s1.name).toUpperCase();

		s1.name="Something";
		System.out.println("s1 ref ="+s1.name);
		
		single1 s2=single1.getsingle();
		s2.data();
		System.out.println("s2 ="+s2.name);
		s2.name=(s2.name).toLowerCase();
		System.out.println("s1 ="+s2.name);
		System.out.println(s1.toString());
		System.out.println(s1.equals(s2));
		

	}

}
