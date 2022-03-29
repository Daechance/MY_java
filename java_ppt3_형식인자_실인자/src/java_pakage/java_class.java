package java_pakage;

public class java_class {
	protected void gugudan(int dan) //형식인자
	{
		for(int i = 1; i < 10; i++)
			System.out.printf("%d * %d = %d \n", dan, i, dan* i);
	}
	public static void main(String[] args) {
		java_class g = new java_class();
		
		g.gugudan(3); //실인자
	
	}

}
