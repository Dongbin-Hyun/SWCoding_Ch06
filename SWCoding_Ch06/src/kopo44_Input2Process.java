
public class kopo44_Input2Process {

	String[] name;
	int[] kor;
	int[] eng;
	int[] mat;
	int[] sum;
	double[] ave;
	int sumKor = 0;
	int sumEng = 0;
	int sumMat = 0;
	int sumSum = 0;
	double sumAve = 0;
	double korAve = 0;
	double engAve = 0;
	double matAve = 0;
	double aveSum = 0;
	double aveAve = 0;

	
	public kopo44_Input2Process(int iPerson) {
		// TODO Auto-generated constructor stub
		name = new String[iPerson];
		kor = new int[iPerson];
		eng = new int[iPerson];
		mat = new int[iPerson];
		sum = new int[iPerson];
		ave = new double[iPerson];
	}
		


	public void SetData(int i, String name_in, int kor_in, int eng_in, int mat_in) {
		name[i] = name_in;
		kor[i] = kor_in; 
		eng[i] = eng_in;
		mat[i] = mat_in;
		sum[i] = kor_in + eng_in + mat_in;
		ave[i] =  (sum[i] / 3.0);
		
		
	}
	public void sumSubject(int iPerson) {
		for (int i = 0; i < iPerson; i++) {
			sumKor += kor[i];
			sumEng += eng[i];
			sumMat += mat[i];
			sumSum += sum[i];
			sumAve = sumSum / 3;
		}
		
		
		
		
		for (int i = 0; i < iPerson; i++) {
			korAve = sumKor / iPerson;
			engAve = sumEng / iPerson;
			matAve = sumMat / iPerson;
			aveSum = korAve + engAve + matAve;
			aveAve = sumAve / iPerson;
			
			
			
		}
		
	}
	
}
