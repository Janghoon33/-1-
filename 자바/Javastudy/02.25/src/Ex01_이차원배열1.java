
public class Ex01_�������迭1 {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
        int num=1;
        // ù���� for���� ���° �࿡ �ִ� �迭���� ��Ÿ����
        // ������ �迭���� �迭��.length -> ù��° �迭�� ���̸� ��Ÿ��
        for(int i = 0; i<arr.length;i++) {
        	for(int j = 0;j<arr.length;j++) {
        		arr[i][j] = num;
        		num++;
        	}		
        }
        for(int i = 0; i<arr.length; i++) {
        	for(int j = 0;j<arr[0].length;j++) {
        	    System.out.print(arr[i][j]+"\t");
        	}
        System.out.println();
        }
        
        
        
		
		
		
	}

}
