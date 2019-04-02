package kr.hs.emirim.updown;

import java.util.Scanner;
import java.util.Random;

public class updown {

	public static void main(String[] args) {
		//make Answer
		Random random = new Random();
		int answer = random.nextInt(100)+1; //1~100
		//input
		Scanner scanner = new Scanner(System.in);
		int player = scanner.nextInt();
		//비교
		if (answer > player) {
			System.out.println("UP");
		}
		
		else if (answer > ) {
			System.out.println("DOWN");
		}
		//결과
		else 
			System.out.println("정답입니다.");
		// break
		break;
	}
	
}
