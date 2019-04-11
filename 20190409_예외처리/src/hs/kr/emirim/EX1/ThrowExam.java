package hs.kr.emirim.EX1;

import java.io.*;

class ThrowExam {

	public static void arrayMethod() throws ArrayIndexOutOfBoundsException) {
		// TODO Auto-generated method stub
		String[] irum = new String[3];
		irum[3] = "홍길동";
		}
	public static void main(String[] args) {
		ThrowExam ts = new ThrowExam();
		try {

		} catch (ArrayIndexOutOfBoundsException ae) {
			// TODO: handle exception
			System.out.println("배열 예외 발생");
		}
	}
}