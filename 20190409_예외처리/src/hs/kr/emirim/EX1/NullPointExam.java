package hs.kr.emirim.EX1;

import javax.naming.NamingException;

public class NullPointExam {

	public static void main(String[] args) throws NamingException {
		try {
			String str = null;
			System.out.println("문자열 : " + str.length());
		}
		finally {
			System.out.println("무조건 실행");
		}
	}
}
