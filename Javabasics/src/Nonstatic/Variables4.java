package Nonstatic;

public class Variables4 {

    static double salary=10000.67;
    int empid=1001;
	public static void main(String[] args) {
    System.out.println("salary    ="+Variables4.salary);//10000.67
    Variables4 V1=new Variables4();
    System.out.println("empid     ="+V1.empid);//1001
    Variables4.salary=15000;
    System.out.println("updated salary     ="+Variables4.salary);//15000.0
    V1.empid=150;
    System.out.println("updated empid     ="+V1.empid);//150
    Variables4 V2=new Variables4();
    System.out.println("updated empid     ="+V2.empid);//1001
    V2.empid=500;
    System.out.println("updated empid     ="+V2.empid);//500
    Variables4.salary=25000;
    System.out.println("new updated salary     ="+Variables4.salary);//25000.0
	}

}
