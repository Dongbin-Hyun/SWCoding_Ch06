

public class kopo44_InputData{
	
	String[] name;
	int[] kor;
	int[] eng;
	int[] mat;
	int[] sum;
	double[] ave;

	
	public kopo44_InputData(int iPerson) {
		// TODO Auto-generated constructor stub
		name = new String[iPerson];
		kor = new int[iPerson];
		eng = new int[iPerson];
		mat = new int[iPerson];
		sum = new int[iPerson];
		ave = new double[iPerson];
	}
		


	public void SetData(int i, String name_in, int kor_in, int eng_in, int mat_in) {
		i = i;
		name[i] = name_in;
		kor[i] = kor_in; 
		eng[i] = eng_in;
		mat[i] = mat_in;
		sum[i] = kor_in + eng_in + mat_in;
		ave[i] =  (sum[i] / 3.0);
		
		
	}

}
