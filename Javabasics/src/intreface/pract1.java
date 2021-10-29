package intreface;
interface de1{
	
}
interface de2                       {
	void data();
}
class be1 implements de2{
      public void data() {
		System.out.println("print be1 data");
	}
      public void bata() {
        System.out.println("print be1 bata");
	}
}
 class ce1 implements de1{
	  public void cata() {
        System.out.println("print ce1 cata");
	}
 }
 class fe1 implements de1,de2{
	  public void data() {
	    System.out.println("print fe1 fata");
	}
 }
public class pract1 {
	public static void main(String[] args) {
	  fe1 f1=new fe1();
	  f1.data();
	  ce1 c1=new ce1();
	  c1.cata();
	  be1 b1=new be1();
	  b1.bata();
	  b1.data();
	  de2 d2=new be1();
	  d2.data();
      de2 d3=new fe1();
      d3.data();
	}

}
