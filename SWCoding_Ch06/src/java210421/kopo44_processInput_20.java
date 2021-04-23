package java210421;

import java.util.ArrayList;

public class kopo44_processInput_20 {

	int iPerson = 10;
	
	ArrayList<String> name = new ArrayList<String>();
	ArrayList<Integer> kor = new ArrayList<Integer>();
	ArrayList<Integer> eng = new ArrayList<Integer>();
	ArrayList<Integer> mat = new ArrayList<Integer>();

	for (int i = 0; i < iPerson; i++) {
		name.add(i, String.format("È«±æ%02d",i));
		kor.add(i, (int)(Math.random()*100));
		eng.add(i, (int)(Math.random()*100));
		mat.add(i, (int)(Math.random()*100));
		

	}



}
