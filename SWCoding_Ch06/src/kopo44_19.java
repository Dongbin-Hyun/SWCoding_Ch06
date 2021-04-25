

public class kopo44_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kopo44_18 kopo44_elev3;

		kopo44_elev3 = new kopo44_18();
		for (int i = 0; i < 10; i++) {
			kopo44_elev3.up();
			System.out.printf("MSG elve3[%s]\n", kopo44_elev3.kopo44_help);
		}

		for(int i = 0; i < 10; i++) {
			kopo44_elev3.down();
			System.out.printf("MSG elve3[%s]\n", kopo44_elev3.kopo44_help);
		}

		kopo44_elev3.Repair();
		System.out.printf("MSG elev3[%s]\n", kopo44_elev3.kopo44_help);
	}

}


