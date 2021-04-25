

public class kopo44_18 extends kopo44_11 {
	
	void Repair() {
		kopo44_help = String.format("수리중입니다");
	}
	
	void up() {
		if (kopo44_floor >= kopo44_limit_up_floor) {
			kopo44_help = "마지막층입니다";
		} else {
			kopo44_floor = kopo44_floor + 2;
			kopo44_help = String.format("%d층입니다", kopo44_floor);
		}
		
		this.down();
	}
	
	void down() {
		super.kopo44_down();
		System.out.printf("클래스 안에서 찍고있는 MSG [%s]\n", this.kopo44_help);
	}

}
