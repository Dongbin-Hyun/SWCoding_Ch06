

public class kopo44_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kopo44_15 kopo44_elev3;
		
		kopo44_elev3 = new kopo44_15();
		for (int kopo44_i = 0; kopo44_i < 10; kopo44_i++) {
			kopo44_elev3.kopo44_up();
			System.out.printf("MSG elev3[%s]\n", kopo44_elev3.kopo44_help);
		}
		
		for (int kopo44_i = 0; kopo44_i < 10; kopo44_i++) {
			kopo44_elev3.kopo44_down();
			System.out.printf("MSG elev3[%s]\n", kopo44_elev3.kopo44_help);
		}
		kopo44_elev3.Repair();
		System.out.printf("MSG elev3[%s]\n", kopo44_elev3.kopo44_help);
		

	}

}
