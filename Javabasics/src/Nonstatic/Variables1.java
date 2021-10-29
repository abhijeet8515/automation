package Nonstatic;

public class Variables1 {
  int deptno=10;
	public static void main(String[] args) {
		int age=10;
	System.out.println("puppy age is..."+age);
	age=age+7;
	System.out.println("updated age of puppy is..."+age);
	Variables1 v1 =new Variables1();
	System.out.println("obj dept no is..."+ v1.deptno);
	}
}