

public class kopo44_12 {
	
	static kopo44_11 kopo44_elev1;
	static kopo44_11 kopo44_elev2;
	static kopo44_11 kopo44_elev3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kopo44_elev1 = new kopo44_11();//기본 엘리베이터
		kopo44_elev2 = new kopo44_11(20, 1, 8);//kopo44_(최고층, 최저층, 현재층)
		kopo44_elev3 = new kopo44_11(50, -3, 5);
		
		for (int kopo44_i = 0; kopo44_i < 20; kopo44_i++) {
			kopo44_elev1.kopo44_up();
			kopo44_elev1.kopo44_msg("1번엘레 한층 오르기");
//			
			
//			elev2.up();
//			elev2.msg("2번엘레 한층 오르기");
//			
//			elev3.up(); 
//			elev3.msg("3번앨래 한층 오르기");
						
		}
		
		
		
		
		for (int kopo44_i = 0; kopo44_i < 20; kopo44_i++) {
			kopo44_elev1.kopo44_up(2);
			kopo44_elev1.kopo44_msg("1번엘레 2층씩 오르기");
//			
//			elev2.up(2);
//			elev2.msg("2번엘레 2층씩 오르기");
//			
//			elev3.up(2);
//			elev3.msg("3번엘레 2층씩 오르기");
			
		}
		for (int kopo44_i = 0; kopo44_i < 20; kopo44_i++) {
			kopo44_elev1.kopo44_down(3);
			kopo44_elev1.kopo44_msg("1번엘레 3층씩 내리기");
//			
//			elev2.down(3);
//			elev2.msg("2번엘레 3층씩 내리기");
//			
//			elev3.down(3);
//			elev3.msg("3번엘레 3층씩 내리기");
		}

	}

}
