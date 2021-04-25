import java.text.SimpleDateFormat;
import java.util.Date;

public class kopo44_Input3_Main {
	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
		Date date = new Date();

		int iPerson = 30;

		kopo44_Input3_Processing inData = new  kopo44_Input3_Processing(iPerson);

		for (int i = 0; i < iPerson; i++) {
			String name = String.format("홍길동%02d", i);
			int kor = (int)(Math.random()*100);
			int eng = (int)(Math.random()*100);
			int mat = (int)(Math.random()*100);
			inData.SetData(i, name, kor, eng, mat);

		}
		System.out.printf("%25s\n", "성적집계표");
		System.out.printf("%50s\n", sdf.format(date));
		System.out.println("===============================================================");
		System.out.printf("%-3s%-7s%5s%5s%5s%5s%8s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");
		System.out.println("===============================================================");

		for (int i = 0; i < iPerson; i++) {
		
				
				
			
			System.out.printf("%03d%2s%-8s%4d%7d%7d%7d%10d\n", i+1,  "  ", inData.name[i], inData.kor[i], inData.eng[i], inData.mat[i], inData.sum[i], (int)inData.ave[i]);
			
		}
		inData.sumSubject(iPerson);
		System.out.println("===============================================================");
		System.out.printf("%s%16d%7d%7d%7d%10d\n", "합계", inData.sumKor, inData.sumEng, inData.sumMat, inData.sumSum, (int)inData.sumAve);
		System.out.println("===============================================================");
		System.out.printf("%s%16d%7d%7d%7d%10d", "평균", (int)inData.korAve, (int)inData.engAve, (int)inData.matAve, (int)inData.aveSum, (int)inData.aveAve);


	}
} 