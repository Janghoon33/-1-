
public class Ex04_�޼ҵ�6 {

	public static void main(String[] args) {
		int base = 2;
	      int n = 3;
	      powerN(base,n);
	      
	      
	   }
	   //base�� n ������ ����!
	   //������ �������� �������� ��ȯŸ�� ��ġ�� void��� Ű���带 ����Ѵ�
	   public static void powerN(int base , int n) {
	      //���� ��!!
	      int power = 1;
	      for(int i = 0; i < n; i++) {
	         power = power * base;
	      }
	      //for(int i = 1; i<=n;i++)�� ����
	      System.out.println("��� Ȯ�� : " + power);
	      
	      
	   }

	

}
