package Question6;

import java.util.ArrayList;
import java.util.Scanner;



public class MusicController {
	
	public void MusicPlay() {
		ArrayList<MusicVO> musicList=new ArrayList<>();
		MusicVO music1 = new MusicVO("","",123);
		MusicVO music2 = new MusicVO("","",123);
		MusicVO music3 = new MusicVO("","",123);
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			int i = 0;
		System.out.println("====�����÷��̾�====");
		System.out.print("1.��� 2.��� 3.���� 4.������ 5.������ 6.���� >> ");
		int a =sc.nextInt();
		
		if(a==6) {
			break;
		}
		else if(a==1) {
			i++;
			System.out.println("====���====");
			System.out.print("���� : ");
			String j = sc.next();
			System.out.print("���� : ");
			String g = sc.next();
			System.out.print("�ð� : ");
			int t = sc.nextInt();

			
			musicList.add(i, music1);
			
		}
		
		else if(a==2) {
			System.out.println("====�뷡���====");
			musicList.toString();
			
		}
		else if(a==3) {
			System.out.println("====����====");
			System.out.print("���� : "+musicList.get(i).getTitle());
			System.out.print(", ���� : "+musicList.get(i).getSinger());
			System.out.println(", �ð� : "+musicList.get(i).getPlayTime());
		}
		else if(a==4) {
			System.out.println("====������====");
			i--;
			System.out.print("���� : "+musicList.get(i).getTitle());
			System.out.print(", ���� : "+musicList.get(i).getSinger());
			System.out.println(", �ð� : "+musicList.get(i).getPlayTime());
		}
		else if(a==5) {
			System.out.println("====������====");
			i++;
			System.out.print("���� : "+musicList.get(i).getTitle());
			System.out.print(", ���� : "+musicList.get(i).getSinger());
			System.out.println(", �ð� : "+musicList.get(i).getPlayTime());
		}
		}
		
		
	}
}
