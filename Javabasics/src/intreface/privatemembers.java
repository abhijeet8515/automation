package intreface;

public class privatemembers {

	private int accnum=12345;
	private void displayAccNum() {
		System.out.println("accoumt number ="+accnum);
	}
	public static void main(String[] args) {
      
		privatemembers p1=new privatemembers();
		System.out.println(p1.accnum);
		p1.displayAccNum();
	}

}
