
public class Ex05_for������4 {

	public static void main(String[] args) {

//		for (int i = 1; i < 51; i++) {
//			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
//				System.out.print("�ڼ� ");
//			} else if (i % 10 == 5) {
//				System.out.print("���� ");
//			} else {
//				System.out.print(i + " ");
//			}
//		}
		
		for(int i = 1; i <= 50; i++) {
			switch(i%10) {
			case 3,6,9:
				System.out.print("�ڼ� ");
			break;
			case 5 :
				System.out.print("���� ");
				break;
			default:	
				System.out.print(i+" ");
				break;
			}
		}

		
		
		
		
	}

}
