



public class kopo44_MainInputClass_20 {
	public static void main(String[] args) {
	int iPerson = 10;

	kopo44_InputData inData = new kopo44_InputData(iPerson);

	for (int i = 0; i < iPerson; i++) {
		String name = String.format("ȫ�浿%02d", i);
		int kor = (int)(Math.random()*100);
		int eng = (int)(Math.random()*100);
		int mat = (int)(Math.random()*100);
		inData.SetData(i, name, kor, eng, mat);

	}
	for (int i = 0; i < iPerson; i++) {
		System.out.printf("��ȣ:%d, �̸�:%s, ����:%d, ����:%d, ����:%d, ����:%d. ���:%f\n", i, inData.name[i], inData.kor[i], inData.eng[i], inData.mat[i], inData.sum[i], inData.ave[i]);
	}


}
}