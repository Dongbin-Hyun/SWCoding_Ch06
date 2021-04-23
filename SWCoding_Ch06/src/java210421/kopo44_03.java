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
		System.out.printf("%s%28s\n","emart", "�̸�Ʈ ������ (031)888-1234");
		System.out.printf("%28s\n", "206-86-50913 ����");
		System.out.printf("%27s\n", "���� ������ ������� 552");
		System.out.println("������ �������� ��ȯ/ȯ�� �Ұ�");
		System.out.println("�����ǰ�� ����, 30�� �̳�(�ż� 7��)");
		System.out.println("���Ϻ� �귣����� ����(���� ������ ����)");
		System.out.println("��ȯ/ȯ�� ���������� ����(����ī�� ����)");
		System.out.printf("\n");


	}

	public static void kopo44_TimeStemp() {
		System.out.println("[�� ��]" + kopo44sdf1.format(kopo44_date) + "     " + "POS:0011-9861");
		System.out.println("-----------------------------------------");
	}

	public static void kopo44_HeaderPrint() {
		System.out.println("    ��ǰ��         ��  ��  ����    �ݾ�");
		System.out.println("-----------------------------------------");

	}

	public static void kopo44_TotalPrint() {
		String[] kopo44_itemname = {"��-0d974rion-��a0aa��aa��aa��aa������d��30��a", "a����4�����θ�����̴�", "����Ʈ-ǻ�����α۶��̵�",
				"����-��Ϲ���Ĩ", "�뱸�����¸������", "õ�������ְ���", "�����������ް���",
				"�����ī����20Kg", "�񸻸���1ũ��Ư�������90����", "�Ƶ�ٽ�-���۽�Ÿ", "�Ƶ�ٽ�-�߱��۷�s1��",
				"��d����ٹ��߱�ġ10Kg��", "���ֿ���������ġ", "��ü������-Ŀ�Ǹӽ�",
				"�����ѳ���-��Ƽ����뷮100����", "���ִ²ܸ���ȣ��", "��ȭ��-�Ŷ��", "��ɽŶ���",
				"�̸�Ʈ/�����ʹ�", "����ũ-����̿���", "���������÷�1��", "��������Ư���߱�ȹ��ǰ",
				"����-��ݺ�����ġ", "����󱹻�ٳ���", "��", "�����к���ü�߰�","Ȳ���鵵�ͽ�������",
				"������-��īĨ��������", "�����۽�-�ֽ����̽�", "�ƽ�-��ī����뷮"};
		
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
		System.out.printf("%17s%19s\n", "�� ǰ�� ����", kopo44_df.format(kopo44_quantity));
		System.out.printf("%18s%19s\n", "(*)�� ��  �� ǰ", kopo44_df.format(kopo44_taxFreeTotal));
		System.out.printf("%18s%19s\n", "�� ��  �� ǰ", kopo44_df.format(kopo44_taxNet));
		System.out.printf("%19s%19s\n", "��   ��   ��", kopo44_df.format(kopo44_vat));
		System.out.printf("%20s%19s\n", "��        ��", kopo44_df.format(kopo44_total));
		System.out.printf("%6s%29s\n", "�������ݾ�", kopo44_df.format(kopo44_total));
		System.out.println("-----------------------------------------");
		System.out.printf("%11s%28s\n", "0012 KEB �ϳ�", "541707**0484/35860658");
		System.out.printf("%-14s%20s\n", "ī�����(IC)", "�Ͻú� / "+ kopo44_df.format(kopo44_total));
		System.out.println("-----------------------------------------");
		System.out.printf("%22s\n", "[�ż�������Ʈ ����]");
		System.out.println("ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.");
		System.out.printf("%s%15s%12s\n", "��ȸ�߻�����Ʈ", "9350**9995", kopo44_df.format(kopo44_plusPoint));
		System.out.printf("%s%12s%13s\n", "����(����)����Ʈ", kopo44_df.format(kopo44_point+kopo44_plusPoint)+"(",kopo44_df.format(kopo44_point) + ")");
		System.out.printf("%s\n", "*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.");
		System.out.println("-----------------------------------------");

	}
	
	public static void kopo44_TailPrint() {
		kopo44_cal.setTime(kopo44_date);
		kopo44_cal.add(Calendar.HOUR_OF_DAY, -2);
		
		System.out.println("    ���űݾױ��� ���������ð� �ڵ��ο�");
		System.out.println("������ȣ :                       34��****");
		System.out.printf("%s%31s\n", "�����ð� :", kopo44_sdf2.format(kopo44_cal.getTime()));
		System.out.println("-----------------------------------------");
		System.out.printf("%s%25s\n","ĳ��:084599 ��OO", "1150");
		System.out.printf("%34s\n", "|||||||||||||||||||||||||");
		System.out.printf("%15s/0019861/00164980/31", kopo44_sdf3.format(kopo44_date));

		
	}
}
