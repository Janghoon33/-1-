import java.util.Scanner;

public class Ex01_Ȧ¦���ϱ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int odd = 0;
		int even = 0;
		
		while(true) {
			System.out.print("�����Է� : ");
			num = sc.nextInt();
		if(num==-1) {
			break;
		}
		if(num%2 == 1) {
			odd++;
		}else if(num%2 == 0) {
			even++;
		}
		}System.out.println("Ȧ���� ���� : "+ odd);
		System.out.println("¦���� ���� : "+ even);
		
		System.out.println("����!");
		
		
		
		
		
		
		
		
		
	}

}
