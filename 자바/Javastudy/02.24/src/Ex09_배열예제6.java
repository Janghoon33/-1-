import java.util.Scanner;

public class Ex09_�迭����6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] ans = {1,4,3,2,1};
		int[] user = new int[5];
		int cnt = 0;
		System.out.println("==ä���ϱ�==");
		System.out.println("���� �Է��ϼ���");
		for(int i = 0; i<user.length;i++) {
			System.out.print((i+1)+"���� >>");
			user[i] = sc.nextInt();
		}
		System.out.println("����Ȯ��");
		for(int i = 0; i<user.length;i++) {
			if(user[i]==ans[i]) {
				System.out.print("O ");
				cnt++;
			}else {
				System.out.print("X ");
			}
			}
			System.out.print("�� �� : "+ 20*cnt);
		}
		
		
		
		
		
		
		
		
		
		
		
	}


