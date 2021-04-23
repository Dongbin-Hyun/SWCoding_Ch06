package java210421;


import java.util.ArrayList;
import java.util.Scanner;

public class kopo44_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kopo44_09 kopo44_avg = new kopo44_09();


		String kopo44_name = "폴리융";

		ArrayList<String> kopo44_subject = new ArrayList<String>();
		kopo44_subject.add("국어");
		kopo44_subject.add("영어");
		kopo44_subject.add("수학");
		ArrayList<Integer> kopo44_grade = new ArrayList<Integer>();
		kopo44_grade.add(100);
		kopo44_grade.add(100);
		kopo44_grade.add(100);
		
		int kopo44_sum = 0;
		for (int kopo44_i =0; kopo44_i < kopo44_grade.size(); kopo44_i++) {
			kopo44_sum += kopo44_grade.get(kopo44_i);
		}

		System.out.printf("3월 성적표\n");
		System.out.printf("==========================================================\n");
		System.out.printf("%s%5s%5s%5s%5s%5s\n", "이름", kopo44_subject.get(0), kopo44_subject.get(1), kopo44_subject.get(2), "총점", "평균");
		System.out.printf("==========================================================\n");
		System.out.printf("%s%5s%7s%7s%7s%8s\n", kopo44_name, kopo44_grade.get(0), kopo44_grade.get(1), kopo44_grade.get(2), kopo44_sum, kopo44_avg.kopo44_gradeAvg(kopo44_grade.get(0), kopo44_grade.get(1), kopo44_grade.get(2)));
		System.out.printf("\n\n");
		
		kopo44_subject.add("과학");
		kopo44_grade.add(100);
		
		kopo44_sum = 0;
		for (int kopo44_i =0; kopo44_i < kopo44_grade.size(); kopo44_i++) {
			kopo44_sum += kopo44_grade.get(kopo44_i);
		}
		
		System.out.printf("4월 성적표\n");
		System.out.printf("==========================================================\n");
		System.out.printf("%s%5s%5s%5s%5s%5s%5s\n", "이름", kopo44_subject.get(0), kopo44_subject.get(1), kopo44_subject.get(2), kopo44_subject.get(3), "총점", "평균");
		System.out.printf("==========================================================\n");
		System.out.printf("%s%5s%7s%7s%7s%7s%8s\n", kopo44_name, kopo44_grade.get(0), kopo44_grade.get(1), kopo44_grade.get(2), kopo44_grade.get(3), kopo44_sum, kopo44_avg.kopo44_gradeAvg(kopo44_grade.get(0), kopo44_grade.get(1), kopo44_grade.get(2), kopo44_grade.get(3)));
		System.out.printf("\n\n");
		
		kopo44_subject.add("사회");
		kopo44_grade.add(100);
		
		kopo44_sum = 0;
		for (int kopo44_i =0; kopo44_i < kopo44_grade.size(); kopo44_i++) {
			kopo44_sum += kopo44_grade.get(kopo44_i);
		}
		
		System.out.printf("5월 성적표\n");
		System.out.printf("==========================================================\n");
		System.out.printf("%s%5s%5s%5s%5s%5s%5s%5s\n", "이름", kopo44_subject.get(0), kopo44_subject.get(1), kopo44_subject.get(2), kopo44_subject.get(3), kopo44_subject.get(4), "총점", "평균");
		System.out.printf("==========================================================\n");
		System.out.printf("%s%5s%7s%7s%7s%7s%7s%8s\n", kopo44_name, kopo44_grade.get(0), kopo44_grade.get(1), kopo44_grade.get(2), kopo44_grade.get(3), kopo44_grade.get(4), kopo44_sum, kopo44_avg.kopo44_gradeAvg(kopo44_grade.get(0), kopo44_grade.get(1),
				kopo44_grade.get(2), kopo44_grade.get(3), kopo44_grade.get(4)));
		System.out.printf("\n\n");
		
		
		
		







	}


}


