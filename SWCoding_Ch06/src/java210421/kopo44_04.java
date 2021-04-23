package java210421;

public class kopo44_04 {
	int kopo44_limit_up_floor = 10;
	int kopo44_limit_down_floor = 0;
	int kopo44_floor = 1;
	String kopo44_help;
	
	void kopo44_up() {
		if (kopo44_floor == kopo44_limit_up_floor) {
			kopo44_help = "마지막층입니다.";
		} else {
			kopo44_floor++;
			kopo44_help = String.format("%d층입니다.", kopo44_floor);
		}
	}
	
	void kopo44_down() {
		if (kopo44_floor == kopo44_limit_down_floor) {
			kopo44_help = "처음층입니다.";
		} else {
			kopo44_floor--;
			kopo44_help = String.format("%d층입니다.", kopo44_floor);
		}
	}
	
	

}
