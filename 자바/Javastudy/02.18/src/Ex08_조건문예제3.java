import java.util.Scanner;

public class Ex08_���ǹ�����3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Java ���� �Է� : ");
	    int num1 = sc.nextInt();
		System.out.print("Python ���� �Է� : ");
		int num2 = sc.nextInt();
		System.out.print("Android ���� �Է� : ");
		int num3 = sc.nextInt();
		
		if(((num1+num2+num3)/3)>80) {
			System.out.println("�հ�");
		}

	}

}
