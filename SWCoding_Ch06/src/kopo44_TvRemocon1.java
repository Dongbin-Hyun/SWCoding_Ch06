

public class kopo44_TvRemocon1 {

	static int kopo44_limitChannelMax = 10;
	static int kopo44_limitChannelMin = 0;

	static int kopo44_limitVolumeMax = 5;
	static int kopo44_limitVolumeMin = 0; 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------");
		kopo44_channelUP();
		System.out.println("---------------");
		kopo44_channelDown();
		System.out.println("---------------");
		kopo44_volumeUp();
		System.out.println("---------------");
		kopo44_volumeDown();

	}

	public static void kopo44_channelUP() {
		for (int kopo44_i = kopo44_limitChannelMin; kopo44_i < kopo44_limitChannelMax; kopo44_i++) {
			System.out.printf("현재 채널 : %d번\n", kopo44_i);
		}
	}

	public static void kopo44_channelDown() {
		for (int kopo44_i = kopo44_limitChannelMax; kopo44_i > -1; kopo44_i--) {
			System.out.printf("현재 채널 : %d번\n", kopo44_i);
		}
	}

	public static void kopo44_volumeUp() {
		for (int kopo44_i = kopo44_limitVolumeMin = 0; kopo44_i < kopo44_limitVolumeMax; kopo44_i++) {
			System.out.printf("현재 볼륨 : %d\n", kopo44_i);
		}
	}

	public static void kopo44_volumeDown() {
		for (int kopo44_i = kopo44_limitVolumeMax; kopo44_i > -1; kopo44_i--) {
			System.out.printf("현재 볼륨 : %d\n", kopo44_i);
		}
	}


}
