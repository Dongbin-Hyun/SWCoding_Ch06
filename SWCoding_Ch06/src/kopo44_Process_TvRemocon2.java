

public class kopo44_Process_TvRemocon2 {

	public int kopo44_limitChannelMax;
	public int kopo44_limitChannelMin;
	public int kopo44_limitVolumeMax;
	public int kopo44_limitVolumeMin;



	kopo44_Process_TvRemocon2() {

		kopo44_limitChannelMax = 10;
		kopo44_limitChannelMin = 0;
		kopo44_limitVolumeMax = 5;
		kopo44_limitVolumeMin = 0;
	}
	
	kopo44_Process_TvRemocon2(int kopo44_channelUp, int kopo44_channelDown, int kopo44_volumeUP, int kopo44_volumeDown){
		kopo44_limitChannelMax = kopo44_channelUp;
		kopo44_limitChannelMin = kopo44_channelDown;
		kopo44_limitVolumeMax = kopo44_volumeUP;
		kopo44_limitVolumeMin = kopo44_volumeDown;
	}
	
	
	public void kopo44_channelUp() {
		for (int kopo44_i = kopo44_limitChannelMin; kopo44_i < kopo44_limitChannelMax; kopo44_i++) {
			System.out.printf("현재 채널 : %d번\n", kopo44_i);
		}
	}

	public void kopo44_channelDown() {
		for (int kopo44_i = kopo44_limitChannelMax; kopo44_i > -1; kopo44_i--) {
			System.out.printf("현재 채널 : %d번\n", kopo44_i);
		}
	}

	public void kopo44_volumeUp() {
		for (int kopo44_i = kopo44_limitVolumeMin = 0; kopo44_i < kopo44_limitVolumeMax; kopo44_i++) {
			System.out.printf("현재 볼륨 : %d\n", kopo44_i);
		}
	}

	public void kopo44_volumeDown() {
		for (int kopo44_i = kopo44_limitVolumeMax; kopo44_i > -1; kopo44_i--) {
			System.out.printf("현재 볼륨 : %d\n", kopo44_i);
		}
	}
}
