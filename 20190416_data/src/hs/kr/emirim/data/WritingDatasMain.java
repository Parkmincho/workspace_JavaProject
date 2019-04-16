package hs.kr.emirim.data;

import java.io.*;
import java.util.*;

class sungDataRWExam {
	int length;
	String[] name = new String[1];
	String[] address = new String[10];
	double[] math = new double[10];
	double[] english = new double[10];
	double[] total = new double[10];
	double[] avg = new double[10];
	public void writingData(String fname, boolean append) throws IOException {
		FileWriter fw = null;
		BuffferedWriter(new File(fname));
		bw = new BufferedWriter(fw);
		for(int i = 0; i<length; i++) {
			bw.write(name[i] + "\t" +address[i] + "\t" + math[i] + "\t" + english[i] + "\t" + total[i] + "\t" + avg[i]);
			bw.newLine();
		}
		bw.close();
		fw.close();
	}
	catch(FileNotFoundException e) {
		System.out.println("잘못된 파일 이름을 입력했습니다.");
	}
}
public void readingData(String fname) throws IOException {
	try {
		String csvStr = "";
		String tmpStr = "";
		FileReader fr = new FileReader(new File(fname));
		BufferedReader br = new BufferedReader(fr);
		do {
			tmpStr = br.readLine();
			if(tmpStr != null) {
				csvStr += tmpStr + "\t";
			}
		}
		while(tmpStr != null);
		StringTokenizer parse = new String
		
	}
}