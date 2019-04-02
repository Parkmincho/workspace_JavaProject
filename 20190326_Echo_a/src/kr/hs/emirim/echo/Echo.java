package kr.hs.emirim.echo;


import java.util.Scanner;

public class Echo {
	public static void main(String[] args) {
		//반봅
		while(true) {
		Scanner scanner = new Scanner(System.in);
		//input
		//변수의 대입
		String inputString = scanner.nextLine();
		if(inputString.contentEquals("exit")) {
			//변수 출력
			System.out.println("안녕, 잘가");
			break;
		}
		System.out.println(inputString);
		}	
	}
}
