
public class Calculator {
	
	private int num1;
	
	private int num2;
    // �� ������ �����ε�
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	// ���Ѱ� ��ȯ
	public int sum() {
		return num1+num2;
	}
	// ���� ��ȯ
	public int sub() {
		return num1-num2;
	}
	// ���Ѱ� ��ȯ
	public int mul() {
		return num1*num2;
	}
	// ������ ��ȯ
	public double div() {
		return num1/num2;
	}
	
	
}
