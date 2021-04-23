package java210421;

public class kopo44_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kopo44_15 elev3;
		
		elev3 = new kopo44_15();
		for (int i = 0; i < 10; i++) {
			elev3.up();
			System.out.printf("MSG elev3[%s]\n", elev3.help);
		}
		
		for (int i = 0; i < 10; i++) {
			elev3.down();
			System.out.printf("MSG elev3[%s]\n", elev3.help);
		}
		elev3.Repair();
		System.out.printf("MSG elev3[%s]\n", elev3.help);
		

	}

}
