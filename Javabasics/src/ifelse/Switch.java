package ifelse;

public class Switch {

	public static void main(String[] args) {
    int a=10,b=20,ch=3;
    System.out.println("enter users choice...!");
    switch(ch)
{	
    case 1:System.out.println("sum="+(a+b));
	break;
    case 2:System.out.println("sub"+(a-b));
    break;
    case 3:System.out.println("mul"+(a*b));
    break;
    case 4:System.out.println("div"+(a/b));
    break;
    
    default:System.out.println("invalid statement");
  }
 }
}