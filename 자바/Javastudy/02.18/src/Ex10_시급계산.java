import java.util.Scanner;

public class Ex10_�ñް�� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ð��� �Է����ּ��� : ");
		int time = sc.nextInt();
		int money;
		
		if(time>8) {
			money = (int)((time-8)*9000*1.5)+8*9000;
		}
		else {
			money = (time*9000);
		}
		System.out.println("��갪 : " + money);
	
	
	    
	
	
	
	}
	
}
