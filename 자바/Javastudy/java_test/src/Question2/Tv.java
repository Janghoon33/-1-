package Question2;

public class Tv {
	
	String color;
	int channel;
	
	public void Tv(int channel,String color) {
		this.channel=channel;
		this.color=color;
	}
	
//	public void color() {
//		if(channel==7||channel==8) {
//			color = "red";
//		}
//		if(channel==8) {
//			color = "black";
//		}
//	}
	
	public void channelup() {
		channel++;
	}
	
	public void print() {
		System.out.print("Tv�� ���� ä���� : "+ channel+"�̰�,");
		System.out.print("Tv�� ������ "+color+ " �Դϴ�.");
		System.out.println();
	}
	
	public void channeldown() {
		channel--;
	}
}
