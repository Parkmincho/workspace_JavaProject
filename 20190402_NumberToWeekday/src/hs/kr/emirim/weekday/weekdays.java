package hs.kr.emirim.weekday;

import java.util.Scanner;

public class weekdays {

	public static void main(String[] args) {
		String[] weekdays = {"월", "화", "수", "목", "금", "토", "일"};
		//숫자입력
				Scanner scanner = new Scanner(System.in);
				int inputNumber = scanner.nextInt();
				
				//요일 출력 (1=>월요일, 2=>화요일, .... , 7=>일요일)
				System.out.println(weekdays[inputNumber-1]+"요일");
		
	}

}
