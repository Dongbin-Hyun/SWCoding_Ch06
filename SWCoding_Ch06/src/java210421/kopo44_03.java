package java210421;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class kopo44_03 {

	static Calendar kopo44_cal = Calendar.getInstance();
	static DecimalFormat kopo44_df = new DecimalFormat("###,###,###,###,###");
	static SimpleDateFormat kopo44sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	static SimpleDateFormat kopo44_sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	static SimpleDateFormat kopo44_sdf3 = new SimpleDateFormat("yyyyMMdd");
	static Date kopo44_date = new Date();


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		kopo44_TitlePrint();
		kopo44_TimeStemp();
		kopo44_HeaderPrint();
		kopo44_TotalPrint();
		kopo44_TailPrint();

	}

	public static void kopo44_TitlePrint() {
		System.out.printf("%s%28s\n","emart", "이마트 죽전점 (031)888-1234");
		System.out.printf("%28s\n", "206-86-50913 강희석");
		System.out.printf("%27s\n", "용인 수지구 포은대로 552");
		System.out.println("영수증 미지참시 교환/환불 불가");
		System.out.println("정상상품에 한함, 30일 이내(신선 7일)");
		System.out.println("※일부 브랜드매장 제외(매장 고지물 참조)");
		System.out.println("교환/환불 구매점에서 가능(결제카드 지참)");
		System.out.printf("\n");


	}

	public static void kopo44_TimeStemp() {
		System.out.println("[구 매]" + kopo44sdf1.format(kopo44_date) + "     " + "POS:0011-9861");
		System.out.println("-----------------------------------------");
	}

	public static void kopo44_HeaderPrint() {
		System.out.println("    상품명         단  가  수량    금액");
		System.out.println("-----------------------------------------");

	}

	public static void kopo44_TotalPrint() {
		String[] kopo44_itemname = {"참-0d974rion-초a0aa코aa파aa이aa인절미d맛30개a", "a갈아4만든배로만든사이다", "질레트-퓨전프로글라이드",
				"해태-허니버터칩", "대구에서온맛난사과", "천혜향제주감귤", "강원도고랭지햇감자",
				"고시히카리쌀20Kg", "비말마스1크블랙특대사이즈90개입", "아디다스-슈퍼스타", "아디다스-야구글러s1브",
				"직d접담근배추김치10Kg중", "제주원산지은갈치", "돌체구스토-커피머신",
				"깨끗한나라-물티슈대용량100개입", "맛있는꿀맛애호박", "공화춘-컵라면", "농심신라면블랙",
				"이마트/연어초밥", "피코크-들깨미역국", "녹차원흑당시럽1입", "상투과좌특별중기획상품",
				"동원-양반볶음김치", "유기농국산바나나", "김", "디지털복합체중계","황도백도믹스통조림",
				"오리온-포카칩오리지널", "프링글스-핫스파이시", "맥심-모카골드대용량"};
		
		int[] kopo44_price = {5000000, 14020, 25000, 10, 1206, 1350, 7019, 35000, 9900, 89000, 123500, 9999999, 12000, 143200, 8900,
				1080, 790, 670, 9900, 412900, 7741, 1230, 300, 1900, 7800, 23000, 1, 1200, 12, 6400};
		
		int[] kopo44_num = {2, 4, 1, 2, 5, 4, 10, 1, 10, 1, 1, 2, 4, 1, 4, 5, 3, 3, 1, 2, 1, 2, 3, 5, 1, 1, 6, 2, 1, 1};
		
		boolean [] kopo44_taxFree = {false, false, false, false, true, true, true, true, false, false, false, true, true, false,
				false, true, false, false, false, false, false, false, false, true, true, false, false, false, false, false};

		double kopo44_taxRate = 0.1;
		int kopo44_quantity = kopo44_itemname.length;
		double kopo44_total = 0;
		int kopo44_taxFreeTotal = 0;
		int kopo44_taxTotal = 0;
		double kopo44_vat = 0;
		int kopo44_taxNet = 0;
		int kopo44_point = 5743;
		double kopo44_plusPoint = 0;
		int kopo44_lineCount = 0;
		
		for (int kopo44_i = 0; kopo44_i < kopo44_itemname.length; kopo44_i++) {
			String kopo44_temp = kopo44_itemname[kopo44_i] + "                              ";
			byte[] kopo44_bb = kopo44_temp.getBytes();
			int kopo44_count = 0;
			for(int kopo44_j = 0; kopo44_j < 17; kopo44_j++) {
				if(kopo44_bb[kopo44_j] < 0) {
					kopo44_count++;
				}
			}
			if(kopo44_count % 2 == 0) {
				kopo44_temp = new String(kopo44_bb,0,17) + " ";
			} else if (kopo44_bb[13] < 0) {
				kopo44_temp = new String(kopo44_bb,0,16) + "  ";
			} else {
				kopo44_temp = new String(kopo44_bb,0,17) + " ";
			}

			if (kopo44_taxFree[kopo44_i] == true) {
				System.out.printf("*%s%9s%2s%11s\n", kopo44_temp, kopo44_df.format(kopo44_price[kopo44_i]), kopo44_df.format(kopo44_num[kopo44_i]), kopo44_df.format(kopo44_price[kopo44_i]*kopo44_num[kopo44_i]));
				kopo44_taxFreeTotal += kopo44_price[kopo44_i] * kopo44_num[kopo44_i]; 
			} else if (kopo44_taxFree[kopo44_i] == false) {
				System.out.printf(" %s%9s%2s%11s\n", kopo44_temp, kopo44_df.format(kopo44_price[kopo44_i]), kopo44_df.format(kopo44_num[kopo44_i]), kopo44_df.format(kopo44_price[kopo44_i]*kopo44_num[kopo44_i]));
				kopo44_taxTotal += kopo44_price[kopo44_i] * kopo44_num[kopo44_i];
			}
			kopo44_lineCount++;
			if (kopo44_lineCount % 5 == 0) {
				System.out.println("-----------------------------------------");
			}

		}

		kopo44_taxNet = (int)(kopo44_taxTotal / (1+kopo44_taxRate));
		kopo44_vat = kopo44_taxTotal - kopo44_taxNet;
		kopo44_total = kopo44_vat + kopo44_taxFreeTotal + kopo44_taxNet;
		kopo44_plusPoint = kopo44_total / 1000;

		System.out.printf("\n");
		System.out.printf("%17s%19s\n", "총 품목 수량", kopo44_df.format(kopo44_quantity));
		System.out.printf("%18s%19s\n", "(*)면 세  물 품", kopo44_df.format(kopo44_taxFreeTotal));
		System.out.printf("%18s%19s\n", "과 세  물 품", kopo44_df.format(kopo44_taxNet));
		System.out.printf("%19s%19s\n", "부   가   세", kopo44_df.format(kopo44_vat));
		System.out.printf("%20s%19s\n", "합        계", kopo44_df.format(kopo44_total));
		System.out.printf("%6s%29s\n", "결제대상금액", kopo44_df.format(kopo44_total));
		System.out.println("-----------------------------------------");
		System.out.printf("%11s%28s\n", "0012 KEB 하나", "541707**0484/35860658");
		System.out.printf("%-14s%20s\n", "카드결제(IC)", "일시불 / "+ kopo44_df.format(kopo44_total));
		System.out.println("-----------------------------------------");
		System.out.printf("%22s\n", "[신세계포인트 적립]");
		System.out.println("홍*두 고객님의 포인트 현황입니다.");
		System.out.printf("%s%15s%12s\n", "금회발생포인트", "9350**9995", kopo44_df.format(kopo44_plusPoint));
		System.out.printf("%s%12s%13s\n", "누계(가용)포인트", kopo44_df.format(kopo44_point+kopo44_plusPoint)+"(",kopo44_df.format(kopo44_point) + ")");
		System.out.printf("%s\n", "*신세계포인트 유효기간은 2년입니다.");
		System.out.println("-----------------------------------------");

	}
	
	public static void kopo44_TailPrint() {
		kopo44_cal.setTime(kopo44_date);
		kopo44_cal.add(Calendar.HOUR_OF_DAY, -2);
		
		System.out.println("    구매금액기준 무료주차시간 자동부여");
		System.out.println("차량번호 :                       34저****");
		System.out.printf("%s%31s\n", "입차시간 :", kopo44_sdf2.format(kopo44_cal.getTime()));
		System.out.println("-----------------------------------------");
		System.out.printf("%s%25s\n","캐셔:084599 양OO", "1150");
		System.out.printf("%34s\n", "|||||||||||||||||||||||||");
		System.out.printf("%15s/0019861/00164980/31", kopo44_sdf3.format(kopo44_date));

		
	}
}
