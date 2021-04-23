package java210421;

public class kopo44_TvRemocon1 {

	static int limitChannelMax = 10;
	static int limitChannelMin = 0;

	static int limitVolumeMax = 5;
	static int limitVolumeMin = 0; 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------");
		channelUP();
		System.out.println("---------------");
		channelDown();
		System.out.println("---------------");
		volumeUp();
		System.out.println("---------------");
		volumeDown();

	}

	public static void channelUP() {
		for (int i = limitChannelMin; i < limitChannelMax; i++) {
			System.out.printf("현재 채널 : %d번\n", i);
		}
	}

	public static void channelDown() {
		for (int i = limitChannelMax; i > -1; i--) {
			System.out.printf("현재 채널 : %d번\n", i);
		}
	}

	public static void volumeUp() {
		for (int i = limitVolumeMin = 0; i < limitVolumeMax; i++) {
			System.out.printf("현재 볼륨 : %d\n", i);
		}
	}

	public static void volumeDown() {
		for (int i = limitVolumeMax; i > -1; i--) {
			System.out.printf("현재 볼륨 : %d\n", i);
		}
	}


}
