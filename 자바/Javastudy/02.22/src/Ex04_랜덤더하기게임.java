import java.util.Random;
import java.util.Scanner;

public class Ex04_�������ϱ���� {

	public static void main(String[] args) {
        
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int crt = 0;
		int wrg = 0;
		while(true) {
			int num1 = rd.nextInt(10)+1;
			int num2 = rd.nextInt(10)+1;
		System.out.print(num1+"+"+num2+"=");
		int input = sc.nextInt();
		if(num1+num2 == input) {
			System.out.println("Success!");
			crt++;
		}else {
			System.out.println("Fail!");
			wrg++;
		}
		System.out.print("����Ͻðڽ��ϱ�? ");
		String ans = sc.next();
				
		if(ans.equals("Y")) {
			
			continue;
		}
		else if(ans.equals("N")) {
			System.out.println("����!");	
			System.out.println("���� ������ " + crt + "��");
			System.out.println("Ʋ�� ������ " + wrg + "��" );
			break;
			}
		
		
		}
		}
		
		
	

}
