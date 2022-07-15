package Model;

public class MusicVO {
	// �뷡��� �����͸� ǥ�� �� �� �ִ� Ŭ����
	// ����ڰ� ���Ƿ� ���� Ŭ���� -> VOŬ����(Value Object)
	// -> MVC���� �� Model�� �ش��ϴ� Ŭ����
	// Model : �����͸� �����ϴ°�
	// - �䳪 ��Ʈ�ѷ��� ���� � ������ �˼� ����
	// - ������ ������ �Ͼ�� ó���� �� �ִ� ������ �����ؾ��Ѵ�. -> getter/setter
	
	
	
	private String musicName;
	
	private String singer;
	
	private int playTime;
	
	private String path;
	
	
	public MusicVO (String musicName, String singer, int playTime, String path) {
		this.musicName=musicName;
		this.singer=singer;
		this.playTime=playTime;
		this.path=path;
	}
	
	public String getMusicName() {
		return musicName;
	}
	
	public String getSinger() {
		return singer;
	}
	
	public int getPlayTime() {
		return playTime;
	}
	public String getPath() {
		return path;
	}
}
