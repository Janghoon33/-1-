import java.util.Scanner;

public abstract class Ex01_����ġ�����Է� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String data = sc.next();
		
//		if(data.equals("�ѱ���")) {
//			System.out.println("�ȳ��ϼ���!");
//		}else if(data.equals("����")) {
//			System.out.println("���!");
		switch(data) {
		case "�ѱ���":
				System.out.println("�ȳ��ϼ���!");
			break;
	    case "����":
				System.out.println("���!");
			break;
	    case "�Ϻ���":
	    	    System.out.println("������!");
	    	break;    
		}
	}

	}


