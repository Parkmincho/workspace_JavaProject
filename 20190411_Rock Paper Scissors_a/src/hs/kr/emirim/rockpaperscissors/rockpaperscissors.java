package hs.kr.emirim.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class rockpaperscissors {

	public static void main(String[] args) {
		String[] pae = {"가위", "바위", "보"};
		//사용자의 입력을 발하자(1 : 가위, 2 : 바위, 3 : 보)

		Scanner scanner = new Scanner(System.in);
		while (true) {
			int p = scanner.nextInt();
			if(p == 0) {
				break;
			}
			//컴퓨터의 패를 구하자
			int c = makeComputer();
			//사용자의 패를 비교하자
			//		int result = compare(p, c);
			if(p == 1) {
				System.out.println();
			}
			//결과 출력
			System.out.println("사용자 : " + pae[p - 1] + "\t컴퓨터 : " + pae[c - 1]);
		}

	}

	private static int compare(int p, int c) {
		//-1 : 사용자가 질 때
		//		if((p == 1 && c == 2) || (p == 2 && c == 3) || (p == 3 && c == 1)) {
		if((p + 1) % 3 == c) {
			return -1;
		}
		//0 : 비김
		//	else if((p == 1 && c == 1) || (p == 2 && c == 2) || (p == 3 && c == 3)) {
		else if(p == c) {
			return 0;
		}
		//그 이외
		else {
			return 1;
		}
	}

	private static int makeComputer() {
		Random random = new Random();
		Random rondom = null;
		int c = rondom.nextInt(3-1+1)+1; //1~3의 양의 수
		return c;
	}
}
