package Nonstatic;

public class Variables2 {
    int empid;//0
    double salary;//0.0
	public static void main(String[] args) {
	//classname referancevariable=new classnane();
		Variables2 obj=new Variables2();                 	//object creation
		
		System.out.println("obj empid    ="+obj.empid);  //0
		System.out.println("obj salary    ="+obj.salary); //0.0

        obj.empid=100;
        obj.salary=15000.768;

	    System.out.println("updated obj empid    ="+obj.empid);//100
		System.out.println("updated obj salary    ="+obj.salary);//15000.768
		
		Variables2 obj2=new Variables2();
		System.out.println("obj2 empid    ="+obj2.empid);//0
		System.out.println("obj2 salary    ="+obj2.salary);//0.0

		System.out.println("obj empid    ="+obj.empid);//100
		System.out.println("obj salary    ="+obj.salary);//15000.768
		
        Variables2 obj3=new Variables2();
		System.out.println("obj3 empid    ="+obj3.empid);//0
		System.out.println("obj3 salary    ="+obj3.salary);//0.0
	}
}
