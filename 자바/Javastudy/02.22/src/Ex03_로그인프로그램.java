import java.util.Scanner;

public class Ex03_�α������α׷� {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 1; 
		while(true) {
			System.out.print("���̵� �Է� : ");
			String id = sc.next();
				
			System.out.print("��й�ȣ �Է� : ");
			String pswd = sc.next();
			
			
			if(id.equals("smhrd")&&pswd.equals("1234")) {
				System.out.println("�α��� ����");
				break;
			}else {
				System.out.println("�α��� ����");
			    System.out.print("����Ͻðڽ��ϱ�? ");
				String ans = sc.next();	
				if(ans.equals("N")) {
					break;
				}else if(ans.equals("Y")) {
					if(cnt >= 3) {
						System.out.println("���������� �Ͻʽÿ�");
						break;
						
					}
					cnt++;
					
				}
			}
			
		}
		
		
		
	}

}
