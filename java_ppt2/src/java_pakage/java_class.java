package java_pakage;

public class java_class {
	int height;
	int width;
	protected int Calculation() // ���� ��Ű�� Ŭ���� ���� Ȥ�� ��Ӱ��� Ŭ���� ����
	{
		return height * width;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java_class nemo; //class�� ��ü
		nemo = new java_class();  //��ü ����

		nemo.height = 10;
		nemo.width = 10;
		
		int sum  = nemo.Calculation();
		System.out.printf("�׸� �� ������ %d�Դϴ�.", sum);
	
	}

}
