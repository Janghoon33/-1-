
public class Student_main {

	public static void main(String[] args) {
		
		//new --> ������ �Ҵ����ٰſ���(������ش�)
		//Student() --> ������
		Student jh = new Student();
		jh.name = "Janghoon";
		jh.number = "121523432";
		jh.age = 26;
		jh.scoreJava = 100;
		jh.scoreWeb = 99;
		jh.scoreAndroid = 98;
		System.out.println("�̸� : "+jh.name);
		System.out.println("�й� : "+jh.number);
		System.out.println("���� : "+jh.age);
		System.out.println("Java���� : "+jh.scoreJava);
		System.out.println("Web���� : "+jh.scoreWeb);
		System.out.println("Android���� : "+jh.scoreAndroid);
		
		Student st2 = new Student();
		st2.name = "����";
		st2.number = "20210337";
		st2.age = 21;
		st2.scoreJava = 99;
		st2.scoreWeb = 100;
		st2.scoreAndroid = 80;
		
		
		jh.studentAvg();
		st2.studentAvg();
		
		
		
		
//		System.out.println("���� ��� : "+jh.studentAvg());
//		System.out.println("���� ��� : "+st2.studentAvg());
	}
//	public static int avg(int Java, int Web, int Android) {
//		int result = (Java+Web+Android)/3;
//		return result;
//	}

}
