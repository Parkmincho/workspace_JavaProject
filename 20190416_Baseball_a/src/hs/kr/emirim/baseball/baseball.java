package hs.kr.emirim.baseball;

import java.util.Random;
import java.util.Scanner;

public class baseball {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//정답 만들기
		//1~9까지 랜덤숫자 3번 뽑기, 중복없이
		String c = makeComputer();
		while(true) {
			//무한반복
			//	1~9까지 세자리 숫자 입력
			String p = scanner.nextLine();
			//	strike, ball 구하자
			boolean isEnd =  play(p, c);
			if(isEnd == true) {
				System.out.println("HIT");
				break;
			}
		}
	}



	private static String makeComputer() {
		StringBuffer buffer = new StringBuffer();
		//1~9 랜덤함수숫자
		Random random = new Random();
		for(int i = 0; i < 3;) {
			int r = random.nextInt(9 - 1 + 1) + 1;
			String rString = String.valueOf(r);
			//StringBuffer에 넣기전에, 있는지 확인
			if(!buffer.toString().contains(rString)) {
				buffer.append(rString);
				i++;
			}

		}
		return "719";
		
	}



	private static boolean play(String p, String c) {
		int strike = 0;
		int ball = 0;
		//		for i 사용자인데스 돌고
		for(int i = 0; i < p.length(); i++) {
			//			for j 컴퓨터인데스 돌고
			for(int j = 0; j < c.length(); j++) {
				//				if p[i] == c[i]
				if(p.charAt(i) == c.charAt(j)) {
					//if i == j, strike++;
					if(i == j) strike++;
					//else, ball++
					else ball++;
				}

			}
		}
		//p, strike, ball 출력
		System.out.println(p + "\tstrike : " + strike + "\tball" + ball);
		//strike == 입력한 문자열 길이만큼 나오면 HIT
		//p와 c가 같을때, return true
		if(p.equals(c))
			return true;
		return false;
	}
}
