package View;
import java.util.ArrayList;
import java.util.Scanner;

import Controller.MP3Controller;
import Model.MusicVO;
import javazoom.jl.player.MP3Player;

public class MusicVO_main {

	public static void main(String[] args) {
		
		// View : ����ڰ� ����ϴ� ���, �ð������� Ȯ���� �� �� �ִ� �뵵�θ� ���δ�
		// - Model�� ������ �ִ� �����͸� �������� �ʴ´�
		// - �ܼ��� ǥ�ø� �ϴ� ����� ���´�
		
		
		
		Scanner sc = new Scanner(System.in);
		
		// Controller ��ü ����
		MP3Controller controller = new MP3Controller();
		
		int menu = 0;
		
		// �뷡�� Main�� �˷��ٷ��� -> MusicVO��ü ����
		
		
		//���° �뷡���� -> �ε����� �Ǵ�
		
		//�������� MP3�÷��� ���
		
		
		
		while(true) {
			System.out.print("1.��� 2.���� 3.������ 4.������ 5.���� >> ");
			int num = sc.nextInt();
			
			if(num == 5) {
				break;
			}
			else if(num == 1) {
				controller.playing();
				
			}
			else if(num == 2) {
				//����
				System.out.println("����");
				controller.stoping();
			}
			else if(num == 3) {
				controller.nextPlay();
				}
				
				
			else if(num ==4) {
				controller.prePlay();
			}
				System.out.println("���α׷� ����");
			controller.stoping();
			
		}

	
	
	}
	
}

