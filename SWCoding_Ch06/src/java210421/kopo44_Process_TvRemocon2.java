package java210421;

public class kopo44_Process_TvRemocon2 {

	public int limitChannelMax;
	public int limitChannelMin;
	public int limitVolumeMax;
	public int limitVolumeMin;



	kopo44_Process_TvRemocon2() {

		limitChannelMax = 10;
		limitChannelMin = 0;
		limitVolumeMax = 5;
		limitVolumeMin = 0;
	}
	
	kopo44_Process_TvRemocon2(int channelUp, int channelDown, int volumeUP, int volumeDown){
		limitChannelMax = channelUp;
		limitChannelMin = channelDown;
		limitVolumeMax = volumeUP;
		limitVolumeMin = volumeDown;
	}
	
	
	public void channelUp() {
		for (int i = limitChannelMin; i < limitChannelMax; i++) {
			System.out.printf("현재 채널 : %d번\n", i);
		}
	}

	public void channelDown() {
		for (int i = limitChannelMax; i > -1; i--) {
			System.out.printf("현재 채널 : %d번\n", i);
		}
	}

	public void volumeUp() {
		for (int i = limitVolumeMin = 0; i < limitVolumeMax; i++) {
			System.out.printf("현재 볼륨 : %d\n", i);
		}
	}

	public void volumeDown() {
		for (int i = limitVolumeMax; i > -1; i--) {
			System.out.printf("현재 볼륨 : %d\n", i);
		}
	}
}
