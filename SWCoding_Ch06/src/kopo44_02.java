
public class kopo44_02 {
	
	static int kopo44_iStatic;
	
	public static void kopo44_add(int kopo44i) {
		kopo44_iStatic++;
		kopo44i++;
		System.out.printf("add�޼ҵ忡�� -> iStatic = [%d]\n", kopo44_iStatic);
		System.out.printf("add�޼ҵ忡�� -> i =[%d]\n", kopo44i);
	}
	
	public static int kopo44_add2(int kopo44_i) {
		kopo44_iStatic++;
		kopo44_i++;
		System.out.printf("add�޼ҵ忡�� -> iStatic = [%d]\n", kopo44_iStatic);
		System.out.printf("add�޼ҵ忡�� -> i =[%d]\n", kopo44_i);
		return kopo44_i;
	}
	public static void main(String[] args) {
		int kopo44_iMain;
		
		kopo44_iMain = 1;
		kopo44_iStatic = 1;
		
		System.out.printf("**************************************\n");
		System.out.printf("�޼ҵ�ȣ���� ���ο��� -> iStatic = [%d]\n", kopo44_iStatic);
		System.out.printf("�޼ҵ�ȣ���� ���ο��� -> iMain = [%d]\n", kopo44_iMain);
		System.out.printf("**************************************\n");
		
		kopo44_add(kopo44_iMain);
		
		System.out.printf("**************************************\n");
		System.out.printf("�޼ҵ�ȣ���� ���ο��� -> iStatic = [%d]\n", kopo44_iStatic);
		System.out.printf("�޼ҵ�ȣ���� ���ο��� -> iMain = [%d]\n", kopo44_iMain);
		System.out.printf("**************************************\n");
		
		kopo44_iMain = kopo44_add2(kopo44_iMain);
		
		System.out.printf("**************************************\n");
		System.out.printf("�޼ҵ� add2ȣ���� ���ο��� -> iStatic = [%d]\n", kopo44_iStatic);
		System.out.printf("�޼ҵ� add2ȣ���� ���ο��� -> iMain = [%d]\n", kopo44_iMain);
		System.out.printf("**************************************\n");
		
		
		
	}

}
