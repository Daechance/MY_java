package java_pakage;

public class java_class {
	int height;
	int width;
	protected int Calculation() // 동일 패키지 클래스 내부 혹은 상속관계 클래스 접근
	{
		return height * width;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java_class nemo; //class의 객체
		nemo = new java_class();  //객체 생성

		nemo.height = 10;
		nemo.width = 10;
		
		int sum  = nemo.Calculation();
		System.out.printf("네모 의 면적은 %d입니다.", sum);
	
	}

}
