package Method;

public class Ex01_�޼ҵ�1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int result = add(num1,num2);
		System.out.println("��� : " + result);
		// �޼ҵ� �̸����� ȣ�� : �޼ҵ带 ����Ҳ�����
		int result2 = minus(num1,num2); //���� ��ü�� �޼ҵ�� �Ѱ��ִ°� �ƴ϶� ���� �ȿ� �ִ� ���� �Ѱ��ش�
		System.out.println("��� : " + result2);
		
		int result3 = mul(num1,num2);
		System.out.println("��� : " + result3);
		
		int result4 = div(num1,num2);
		System.out.println("��� : " + result4);
	}
	// �޼ҵ� : ���־��� ����� ���� �����°��� �ǹ�
	// �ʿ��Ҷ����� �ҷ��ͼ� ���
    // public : ���� ������ -> �� �޼ҵ带 ������ �������� ����Ұ��ΰ�?
	// static : �����ϴ�
	// int : ���� Ÿ��(��ȯ Ÿ��)
	// add(int num1,int num2) : �޼ҵ� �̸� (�ʿ����){�޼ҵ� ���� ����}
    // return result; -> �����͸� ��ȯ (�߿�ڡڡڡ� ������ ����� ���� Ÿ�Կ� �°� �����͸� ��ȯ������Ѵ�)
	
	public static int add(int num1, int num2) {
	int result = num1+num2;
	return result;
}
	public static int minus(int data1, int data2) {
		int result = data1-data2;
		return result;
	}
	public static int mul(int data3, int data4) {
		int result = data3*data4;
		return result;
	}
	public static int div(int data5,int data6) {
		int result = data5/data6;
		return result;
	}
	

    
    
    
    
    
    
    
    
    
    
}  