import java.util.Scanner;

public class Ex02_���׿���1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է� : ");
		int number = sc.nextInt();
		
		String result = (number%2==0) ? "¦��" : "Ȧ��";
		System.out.println("���� �Է��� ���ڴ� " + result + "�Դϴ�");
		
		
		
	}

}
