
public class Student {
	
	String name;
	
	String number;
	
	int age;
	
	int scoreJava;
	
	int scoreWeb;
	
	int scoreAndroid;
	

	//��� ���ϴ� ��� + ��±��� ����
	//�ٸ� Ŭ�������� �޼ҵ带 ���鶧 ���� static�� �������� �ʾƵ� �ȴ�
	public void studentAvg() {
		int result = (scoreJava+scoreWeb+scoreAndroid)/3;
		System.out.println("��� : "+result);
	}
	
}
