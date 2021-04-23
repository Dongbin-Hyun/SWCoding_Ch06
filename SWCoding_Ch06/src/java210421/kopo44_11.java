package java210421;

public class kopo44_11 {

	public int kopo44_limit_up_floor;
	public int kopo44_limit_down_floor;
	public int kopo44_floor;
	public String kopo44_help;

	kopo44_11() {//생성자
		//클래스명과 동일한 메소드
		//주로 초기값 설정을 위해 사용됨
		kopo44_limit_up_floor = 10;
		kopo44_limit_down_floor = 1;
		kopo44_floor = 1;
		kopo44_help = "엘리베이터 기본 준공완료";	
	}

	kopo44_11(int kopo44_up_floor, int kopo44_d_floor, int in_floor) {
		kopo44_limit_up_floor = kopo44_up_floor;
		kopo44_limit_down_floor = kopo44_d_floor;
		kopo44_floor = in_floor;
		kopo44_help = "엘리베이터 맞춤 준공완료";	
	}

	void kopo44_up() {
		if (kopo44_floor == kopo44_limit_up_floor) {
			kopo44_help = "마지막 층입니다";
		} else {
			kopo44_floor++;
			kopo44_help = String.format("[%d] 층입니다",kopo44_floor);
		}
	}
	
	void kopo44_down() {
		if (kopo44_floor == kopo44_limit_down_floor) {
			kopo44_help = "처음 층입니다" ;
			} else {
				kopo44_floor--;
				kopo44_help = String.format("[%d] 층입니다",kopo44_floor);
			}
	}
	
	void kopo44_up(int kopo44_u) {
		for (int kopo44_i = 0; kopo44_i < kopo44_u; kopo44_i++) this.kopo44_up();
		
	}
	
	void kopo44_down(int kopo44_u) {
		for (int kopo44_i = 0; kopo44_i < kopo44_u; kopo44_i++) kopo44_down();
	}
	
	void kopo44_msg(String kopo44_id) {
		System.out.printf("%s => [%s] 최대층[%d] 최소층[%d] 현재층[%d]\n", kopo44_id, kopo44_help, kopo44_limit_up_floor, kopo44_limit_down_floor, kopo44_floor);
	}

}
