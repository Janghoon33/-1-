
public class Ex01_�޼ҵ�3 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 24;
		int result = LN(num1,num2);
		System.out.print("�� ū ���� : ");
		System.out.print(LN(num1,num2));
		// = System.out.println("ū �� Ȯ�� : " + result);
		

	}
	public static int LN(int num1,int num2) {
		int result;
		if(num1>num2) {
			result = num1;
		}else if(num2>num1){
			result = num2;
		}else {
			result = 0;
		}
		return result;
	}

}
