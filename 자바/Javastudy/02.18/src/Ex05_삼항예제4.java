import java.util.Scanner;

public class Ex05_���׿���4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�뵿�ð��� �Է��ϼ��� : ");
		int hour = sc.nextInt();
		
		int money = (hour > 8) ? (int)(8*9000 +(hour-8)*9000*1.5 ) : (hour*9000);
		
		System.out.println(money + "��");
		
		
		
		
		
		
		
		
		
		
		

	}

}
