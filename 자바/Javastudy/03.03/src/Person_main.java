import java.util.ArrayList;

public class Person_main {

	public static void main(String[] args) {
		
		//Person() : ������
		//Ŭ������ŭ�� ������ ��ü(���ÿ����� p1)�� �Ҵ����ش�!!
		Person p1 = new Person("��ȯ",20,173,70);
		//p1�� ���� ��ȯ�� '��¥��'���� �����ϰ� ������
		p1.setName("��ȯ��");
//		p1.name="��ȯ";
//		p1.age=20;
//		p1.tall=173;
//		p1.weight=70;
		//������ ������ ������ �����͸� �־��ٲ��� ������ ��������鼭 �����͵� ���� ������ ���� ���ڴ�
		
		//���� ��ü
		Person p2 = new Person();		
		p2.setName("����");
		System.out.println("�̸�2 : "+ p2.getName());
		p2.setAge(21);
	    System.out.println("����2 : "+p2.getAge());
	    p2.setTall(180);
	    System.out.println("Ű2 : "+p2.getTall());
	    p2.setWeight(70);
	    System.out.println("������2 : "+p2.getWeight());
		
		p2.getData();

	Person p3 = new Person("������",30,175,60);
	
	Person p4 = new Person("���ν�",21,160,40);
	
	// �����͸� �ѹ��� �ٷ�� �ִ� ��� -> �迭
	// ��ü �迭 ����
	// ������Ÿ��[] �迭�� = new ������Ÿ��[3];
	Person[] pArray = new Person[4];
	pArray[0] = p1;
	pArray[1] = p2;
	pArray[2] = p3;
	pArray[3] = p4;
	// pArray�� ����ؼ� ��ȯ���� Ű ���
	// pArray[0] -> p1
	p1.getTall();
	pArray[0].getTall();
	System.out.println("��ȯ�� Ű : "+pArray[0].getTall());
	// pArray�� ����ؼ� ������ ���̸� ���
	p2.getAge();
	pArray[1].getAge();
	System.out.println("���� ���� : "+pArray[1].getAge());
	
	// pArray�� ����ؼ� �����Ե� ��� ���� ���
	pArray[0].getAge(); //20
	pArray[1].getAge(); //21
	pArray[2].getAge(); //30
	pArray[3].getAge(); //21
	
	// System.out.println("�����Ե� ��� ���� : "+(pArray[0].getAge()+pArray[1].getAge()+pArray[2].getAge()+pArray[3].getAge())/4);
	
	int sum = 0;
	for(int i=0; i<pArray.length;i++) {
		sum += pArray[i].getAge();
	}
	System.out.println("���� ��� : "+ sum/pArray.length);
	
	for(int i = 0; i<pArray.length;i++) {
		System.out.println(pArray[i].getName());
	}
	//�ڿ��� -> pArray�� �߰��ϰ� �ʹ�?
	//->�Ұ���
	
//	int[] nArray = {10,20,30};
//	nArray[3]=40;
	//�� �迭�� �Ѱ� : �̹� ũ�Ⱑ �������� �����͸� �߰��ϰų� �迭�� ũ�⸦ �ٲܼ� ����
	// �迭�� �Ѱ踦 �پ� �Ѵ� �迭 : ArrayList
	
	//�����Ե��� ��ü�� ���� �� �ִ� ArrayList
	ArrayList<Person> pArrayList = new ArrayList<Person>();
	pArrayList.add(p1);
	pArrayList.add(p2);
	pArrayList.add(p3);
	pArrayList.add(p4);
	
	//pArrayList�� ����ؼ� ��ȯ���� ������ ���
	//�̸� : ��ȯ
	//���� : 20
	//Ű : 173
	//������ : 70
	//��ü ��̸���Ʈ
	for(int i = 0; i<pArrayList.size();i++) {
	System.out.println("�̸� : "+ pArrayList.get(i).getName());
	System.out.println("���� : "+ pArrayList.get(i).getAge());
	System.out.println("Ű : "+ pArrayList.get(i).getTall());
	System.out.println("������ : "+ pArrayList.get(i).getWeight());
	}
	
	
	
	}
}

