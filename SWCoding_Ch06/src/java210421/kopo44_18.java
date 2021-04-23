package java210421;

public class kopo44_18 extends kopo44_11 {
	
	void Repair() {
		help = String.format("수리중입니다");
	}
	
	void up() {
		if (floor >= limit_up_floor) {
			help = "마지막층입니다";
		} else {
			floor = floor + 2;
			help = String.format("%d층입니다", floor);
		}
		
		this.down();
	}
	
	void down() {
		super.down();
		System.out.printf("클래스 안에서 찍고있는 MSG [%s]\n", this.help);
	}

}
