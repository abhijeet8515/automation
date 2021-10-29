package ifelse;

public class Elseifladder {

	public static void main(String[] args) {
int marks=10;
System.out.println("enter marks");
if(marks>80) {
	System.out.println("topper");

	}
else if(marks<80 && marks>=60) {
	System.out.println("first");

}else if(marks<35) {
	System.out.println("fail");

}
else {
	System.out.println("second");


}
}
}