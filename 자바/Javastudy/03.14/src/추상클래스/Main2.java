package �߻�Ŭ����;

public class Main2 {

	public static void main(String[] args) {
		TempEmployee temp = new TempEmployee("SMHRD002","��O��",3000);
		System.out.println(temp.print());
		System.out.println(temp.getMoneyPay()+"����");
		
		System.out.println();
		
		PartTimeEmployee partTime = new PartTimeEmployee("SMHRD003","��O��", 10, 10);
		System.out.println(partTime.print());
		System.out.println(partTime.getMoneyPay());
		
		
		
	}

}
