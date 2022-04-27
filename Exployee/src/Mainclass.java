
public class Mainclass {

	public static void main(String[] args) {
		Exployee e1, e2;
		
		e1 = new Exployee();
		e2 = new Exployee(1234, "Serva", "Mark", 5000.0 );
		
		e1.setSalary(100000.0);
		
		e1.setLastname("Smith");
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println(e1.getMonthlySalary());
		System.out.println(e2.getMonthlySalary());

	}

}
