package java210421;

public class kopo44_11 {

	public int kopo44_limit_up_floor;
	public int kopo44_limit_down_floor;
	public int kopo44_floor;
	public String kopo44_help;

	kopo44_11() {//������
		//Ŭ������� ������ �޼ҵ�
		//�ַ� �ʱⰪ ������ ���� ����
		kopo44_limit_up_floor = 10;
		kopo44_limit_down_floor = 1;
		kopo44_floor = 1;
		kopo44_help = "���������� �⺻ �ذ��Ϸ�";	
	}

	kopo44_11(int kopo44_up_floor, int kopo44_d_floor, int in_floor) {
		kopo44_limit_up_floor = kopo44_up_floor;
		kopo44_limit_down_floor = kopo44_d_floor;
		kopo44_floor = in_floor;
		kopo44_help = "���������� ���� �ذ��Ϸ�";	
	}

	void kopo44_up() {
		if (kopo44_floor == kopo44_limit_up_floor) {
			kopo44_help = "������ ���Դϴ�";
		} else {
			kopo44_floor++;
			kopo44_help = String.format("[%d] ���Դϴ�",kopo44_floor);
		}
	}
	
	void kopo44_down() {
		if (kopo44_floor == kopo44_limit_down_floor) {
			kopo44_help = "ó�� ���Դϴ�" ;
			} else {
				kopo44_floor--;
				kopo44_help = String.format("[%d] ���Դϴ�",kopo44_floor);
			}
	}
	
	void kopo44_up(int kopo44_u) {
		for (int kopo44_i = 0; kopo44_i < kopo44_u; kopo44_i++) this.kopo44_up();
		
	}
	
	void kopo44_down(int kopo44_u) {
		for (int kopo44_i = 0; kopo44_i < kopo44_u; kopo44_i++) kopo44_down();
	}
	
	void kopo44_msg(String kopo44_id) {
		System.out.printf("%s => [%s] �ִ���[%d] �ּ���[%d] ������[%d]\n", kopo44_id, kopo44_help, kopo44_limit_up_floor, kopo44_limit_down_floor, kopo44_floor);
	}

}
