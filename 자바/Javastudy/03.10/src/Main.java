import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		//���赵�� ���鶧���� ��ü���� ������ �Ұ����ϹǷ� main�޼ҵ�� ������ �ʴ´�
		
		//��ü : ���赵�� ���ؼ� ������ ��������°�
		//���赵 -> ��üȭ  (�ν��Ͻ� ȭ)
		
		//��ü�� �����ϴ� Ű���� ? new
		
		Pocketmon mon1 = new Pocketmon("���α�", "��",70,40,100);
		
//		mon1.name = "���α�";
//		mon1.type = "��";
//		mon1.attack = 70;
//		mon1.defence = 40;
//		mon1.hp = 100;
		
		//��ü�� �����԰� ���ÿ� ���ϴ� �Ӽ��� �����ϱ� -> ������ �޼ҵ� ���
		Pocketmon mon2 = new Pocketmon("���̸�","��",30,55,60);
		
		System.out.println("mon1�� �̸� : "+ mon1.getName());
		System.out.println("mon1�� Ÿ�� : "+ mon1.getType());
		System.out.println();
		System.out.println("mon2�� �̸� : "+mon2.getName());
		System.out.println("mon2�� Ÿ�� : "+mon2.getType());
		System.out.println();
//		mon1.type = "����";
		
		mon1.setAttack(60);
		
		
		// ��ü �迭(�ּ�) ����
		Pocketmon[] ball = new Pocketmon[2];
		ball[0] = mon1;
		ball[1] = mon2;
		
		System.out.println(ball[0].getName());
		
		// ũ�Ⱑ �������� ���� �迭 -> ���� ����Ʈ(= ArrayList)
		// <E> -> ���׸�
		ArrayList<Pocketmon> balls = new ArrayList<>();
		balls.add(mon1);
		balls.add(mon2); // ������ �߰��ϱ�
		
		// ������ �� ����ϱ�
		// mon1�� ��ü ������ ����ϱ�
		
		Random rd = new Random();
		int num = rd.nextInt(balls.size()); // 0 Ȥ�� 1 ����
		
		
		//for(int i = num; i<balls.size();i++) {
			
		System.out.println(balls.get(num).getName());
		System.out.println(balls.get(num).getType());
		System.out.println(balls.get(num).getAttack());
		System.out.println(balls.get(num).getHp());
		System.out.println(balls.get(num).getDefence());
		System.out.println();
		
		
		
		
		
	}

}
