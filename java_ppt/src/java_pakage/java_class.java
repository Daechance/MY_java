package java_pakage;

public class java_class {
	int radius;
	String name;
	public double Calculation()
	{
		return 3.14 * radius * radius;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java_class r = new java_class();
		
		r.name = "����";
		r.radius = 10;
		
		double sum  = r.Calculation();
		System.out.printf("%s �� ������ %.1f�Դϴ�.",r.name, sum);
	
	}

}
