
public class Ex03_�޼ҵ�5 {
public static void main(String[] args) {
	
        int num1 = 11;
        int num2 = 5;
        int result = close10(num1,num2);
        System.out.println("10�� ����� �� : "+result);
}

public static int close10(int num1, int num2) {
// 10���� �Ÿ��� �˾ƾ���
int result = 0; //10�� �� �������� ����� ����

int resultNum1 = 10-num1;
int resultNum2 = 10-num2;

if(resultNum1<0) {
   resultNum1=-1*resultNum1;
}
if(resultNum1<0) {
   resultNum1=-1*resultNum1;
}
//resultNum1, resultNum2 ���� �Ÿ��� �´� ���밪�� ���Ե�
if(resultNum1>resultNum2) {
   result = num2;
}else if(resultNum1<resultNum2) {
   result = num1;
}
return result;
}
	
}
