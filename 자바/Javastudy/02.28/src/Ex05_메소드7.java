import java.util.Arrays;

public class Ex05_�޼ҵ�7 {

	public static void main(String[] args) {
		int[] arr = {1,3,4,8,7,9,10};
		int num1=10;
		aTS(arr,num1);// �迭�ȿ� �ִ� �����͸� ��½�Ű�� �޼ҵ�
		
		System.out.println("���1 : "+arr[0]);
		System.out.println("���2 : "+num1);
		
	}
    public static void aTS(int[] arr,int num1) {
//    for(int i=0; i<arr.length;i++) {
//    	System.out.print(arr[i]+" ");}
    	arr[0] = 30;
    	num1=30;
    System.out.println(Arrays.toString(arr));
    }
    
}
