package Nonstatic;

public class Variables3 {
  double salary=75989.708;
	public static void main(String[] args) {
		Variables3 empone=new Variables3();
		System.out.println("salary   "+empone.salary);//75989.708
		empone.salary=15000.78;
		System.out.println("new salary   "+empone.salary);//15000.78
        Variables3 empone1=new Variables3();
		System.out.println("new salary   "+empone1.salary);//75989.708
		Variables3 empone2=new Variables3();
		System.out.println("new salary   "+empone2.salary);//75989.708
	}

}
