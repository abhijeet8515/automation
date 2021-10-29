package constructor;

public class cons1 {
   int roll;
   double salary;
   cons1(int r,double s){
	roll=r;
	salary=s;
	   System.out.println(roll+"      "+salary);

}
   void display() {
	   System.out.println(roll+"      "+salary);
   }
	public static void main(String[] args) {
		cons1 c1=new cons1(1234,5643.87);
		c1.display();

	}

}
