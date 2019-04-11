package hs.kr.emirim.weekday;

import java.util.Scanner;

public class weekday {

	public static void main(String[] args) {
		//숫자입력
		Scanner scanner = new Scanner(System.in);
		int inputNumber = scanner.nextInt();
		
		//요일 출력 (1=>월요일, 2=>화요일, .... , 7=>일요일)
		
		
		switch(inputNumber) {
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		case 7:
			System.out.println("일요일");
			break;
			default;
		
		}
		System.out.println(inputNumber + "입니다.");
	}

}
