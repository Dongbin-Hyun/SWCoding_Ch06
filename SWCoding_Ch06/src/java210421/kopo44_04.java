package java210421;

public class kopo44_04 {
	int kopo44_limit_up_floor = 10;
	int kopo44_limit_down_floor = 0;
	int kopo44_floor = 1;
	String kopo44_help;
	
	void kopo44_up() {
		if (kopo44_floor == kopo44_limit_up_floor) {
			kopo44_help = "���������Դϴ�.";
		} else {
			kopo44_floor++;
			kopo44_help = String.format("%d���Դϴ�.", kopo44_floor);
		}
	}
	
	void kopo44_down() {
		if (kopo44_floor == kopo44_limit_down_floor) {
			kopo44_help = "ó�����Դϴ�.";
		} else {
			kopo44_floor--;
			kopo44_help = String.format("%d���Դϴ�.", kopo44_floor);
		}
	}
	
	

}
