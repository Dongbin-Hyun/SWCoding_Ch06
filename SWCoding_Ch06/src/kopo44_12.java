

public class kopo44_12 {
	
	static kopo44_11 kopo44_elev1;
	static kopo44_11 kopo44_elev2;
	static kopo44_11 kopo44_elev3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kopo44_elev1 = new kopo44_11();//�⺻ ����������
		kopo44_elev2 = new kopo44_11(20, 1, 8);//kopo44_(�ְ���, ������, ������)
		kopo44_elev3 = new kopo44_11(50, -3, 5);
		
		for (int kopo44_i = 0; kopo44_i < 20; kopo44_i++) {
			kopo44_elev1.kopo44_up();
			kopo44_elev1.kopo44_msg("1������ ���� ������");
//			
			
//			elev2.up();
//			elev2.msg("2������ ���� ������");
//			
//			elev3.up(); 
//			elev3.msg("3���ٷ� ���� ������");
						
		}
		
		
		
		
		for (int kopo44_i = 0; kopo44_i < 20; kopo44_i++) {
			kopo44_elev1.kopo44_up(2);
			kopo44_elev1.kopo44_msg("1������ 2���� ������");
//			
//			elev2.up(2);
//			elev2.msg("2������ 2���� ������");
//			
//			elev3.up(2);
//			elev3.msg("3������ 2���� ������");
			
		}
		for (int kopo44_i = 0; kopo44_i < 20; kopo44_i++) {
			kopo44_elev1.kopo44_down(3);
			kopo44_elev1.kopo44_msg("1������ 3���� ������");
//			
//			elev2.down(3);
//			elev2.msg("2������ 3���� ������");
//			
//			elev3.down(3);
//			elev3.msg("3������ 3���� ������");
		}

	}

}
