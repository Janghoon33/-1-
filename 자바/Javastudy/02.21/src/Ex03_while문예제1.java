import java.util.Scanner;

public class Ex03_while������1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int num = 0;
		//1��° ���
//        while(num<10) {
//        	System.out.print("���� �Է� : ");
//        	num = sc.nextInt();
//        }
//		System.out.println("����Ǿ����ϴ�!");
		//2��° ���
		while(true) {
			System.out.print("�����Է� : ");
			num = sc.nextInt();
			if(num>=10) {
				break;
			}
		}
		System.out.println("����Ǿ����ϴ�!");
		
		
	}

}
