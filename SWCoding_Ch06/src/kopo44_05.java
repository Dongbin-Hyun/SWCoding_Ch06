

public class kopo44_05 {
	
	private static int kopo44_inVal;
	public static void kopo44_up() {
		kopo44_inVal++;
		System.out.printf("난 그냥 메소드[%d]\n", kopo44_inVal);
	}
	
	public static void main(String[] args) {
		
		kopo44_inVal = 0;
		kopo44_04 kopo44_elev;
		
		kopo44_elev = new kopo44_04();
		
		kopo44_up();
		for (int kopo44_i = 0; kopo44_i < 10; kopo44_i++) {
			kopo44_elev.kopo44_up();
			
			System.out.printf("MSG[%s]\n", kopo44_elev.kopo44_help);
			
		}
		
		for (int kopo44_i = 0; kopo44_i < 10; kopo44_i++) {
			kopo44_elev.kopo44_down();
			
			System.out.printf("MSG[%s]\n", kopo44_elev.kopo44_help);
		}
	}

}
