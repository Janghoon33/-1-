
public class Ex02_�޼ҵ�4 {

	public static void main(String[] args) {
		int num1 = -5;
		int num2 = -1;
		int result = close10(num1,num2);
		System.out.println("10�� ����� �� : " + result);

	}
	public static int close10(int num1, int num2) {
		int result = 0;
		if((num1-10)>(num2-10)) {
			result = num2;
		}else if((num1-10)<(num2-10)) {
			result = num1;
		}
		else {
			result = 0;
		}
		return result;
	}

}
