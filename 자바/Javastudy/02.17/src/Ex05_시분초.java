import java.util.Scanner;

public class Ex05_�ú��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		
		int num1 = sc.nextInt();
		
		System.out.println((num1/3600) + "��" + ((num1%3600)/60) + "��" + (num1%60) + "��");

	}

}
