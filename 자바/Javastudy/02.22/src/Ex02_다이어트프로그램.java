import java.util.Scanner;

public class Ex02_���̾�Ʈ���α׷� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ������ : ");
		int cur = sc.nextInt();
		
		System.out.print("��ǥ ������ : ");
		int goal = sc.nextInt();
		int cnt = 1;
		int weight = 0;
		while(true) {
			System.out.print(cnt + "���� ���� ������ : "); 
		    weight = sc.nextInt();
		    cnt++;
		    cur -= weight;
		    if(cur<=goal) {
		    	System.out.println("�����մϴ�!");
		    	System.out.println("���� ������ : "+cur);
		    	break;
		    }
		    }
		
			
		
		
		
		
		
	}

}
