

public class kopo44_18 extends kopo44_11 {
	
	void Repair() {
		kopo44_help = String.format("�������Դϴ�");
	}
	
	void up() {
		if (kopo44_floor >= kopo44_limit_up_floor) {
			kopo44_help = "���������Դϴ�";
		} else {
			kopo44_floor = kopo44_floor + 2;
			kopo44_help = String.format("%d���Դϴ�", kopo44_floor);
		}
		
		this.down();
	}
	
	void down() {
		super.kopo44_down();
		System.out.printf("Ŭ���� �ȿ��� ����ִ� MSG [%s]\n", this.kopo44_help);
	}

}
