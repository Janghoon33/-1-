
public class Phone_main {

	public static void main(String[] args) {
		
		int num = 5;
		// Ŭ���� : �ڷ� + ��� ����� ������ �ڷ���
		Phone lollipop = new Phone(); // ��ü ���� -> Ŭ������ �ִ� �����Ϳ� ����� ����� �� �ִ�
		
		System.out.println("�귣�� : "+lollipop.brand);
		lollipop.Call();
		
		//�Ѹ������� ��ȭ�ޱ�
		lollipop.Send();
		
		System.out.println("��ȭ ��ȣ1 : "+ lollipop.number);
		
		//��ȣ, �귣�带 �ٲ�
		Phone magic = new Phone();
		magic.brand = "�ִ���";
		magic.number = "01056751254";
		System.out.println("�귣��2 : "+magic.brand);
		System.out.println("��ȭ ��ȣ2 : " + magic.number);
		
		Phone apple = new Phone();
		apple.brand = "������";
		apple.number = "01036545471";
		System.out.println("�귣��3 : "+apple.brand);
		System.out.println("��ȭ ��ȣ3 : "+apple.number);
		
		
		
		
	}

}
