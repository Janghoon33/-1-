import java.util.ArrayList;

public class Ex_01_ArrayList {

	public static void main(String[] args) {
		// �迭�� �Ѱ� : �̹� ũ�Ⱑ �������� �����͸� �߰��ϰų� �迭�� ũ�⸦ �ٲܼ� ����
		// �迭�� �Ѱ踦 �پ� �Ѵ� �迭 : ArrayList
		
		
		//�鳻�� ����ϰ��� �ϴ� �������� ������ ��Ȯ�� �𸦶� ����!
		int[]array = new int[1000];
		array[578] = 598;
		
		//ArrayList ���� ���
		//ArrayList<�迭�� �� ������ Ÿ��> ��� ����Ʈ�� = new ArrayList<String>();
		//ArrayList�� ���� Ÿ���� ���۷��� Ÿ�Ը� �����ϴ�(�⺻�ڷ��� Ÿ���� �� �� ����)
		//�⺻ ������ Ÿ������ ArrayList�� ������ֱ� ���ؼ���
		//�⺻ ������ Ÿ���� ǥ���Ҽ� �ִ� Ŭ������ Ȱ�����ָ��
		ArrayList<String> nameArray = new ArrayList<String>();
		//-> ArrayList<Integer> intŸ���� Integer 
		//-> ArrayList<Float>
		
		//������ �߰� .add("�ְ���� ������) -> �����͸� �Է��� ������� �迭�� ����
		//�� �ǵڷ� �������� ���δ�
		nameArray.add("��ȯ��");
		nameArray.add("����");
		nameArray.add("������");
		nameArray.add("���ν�");
		nameArray.add("�ڿ���");
		
		//������ ���
		//��ȯ�� ���
		System.out.println(nameArray.get(0));
		System.out.println(nameArray.get(1));
		System.out.println(nameArray.get(2));
		System.out.println(nameArray.get(3));
		System.out.println(nameArray.get(4));
		
		//ArrayList ũ�� -> .size() = �Ϲ� �迭�� .length�� ����
		for(int i=0; i<nameArray.size();i++) {
			System.out.println(nameArray.get(i));
		}
		
		//������ ���� .remove(����� ���� �ε�����ȣ)
		//� Ư�� ���ǿ��� �ش��ϴ� �����͸� ����� ������
		nameArray.remove(2);
		
		System.out.println(nameArray.size());
		// -> 4 (��°����� ��������)
		
		//������ ���� -> .add(�����Ͱ� �� �ε��� ��ġ, "�ְ����������")
		nameArray.add(1,"����");
		nameArray.add(4,"�ֶ�");
		for(int i=0; i<nameArray.size();i++) {
			System.out.println(nameArray.get(i));
		}
		
		
		
	}

}
