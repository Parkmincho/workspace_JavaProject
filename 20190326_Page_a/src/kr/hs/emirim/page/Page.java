package kr.hs.emirim.page;

import java.util.Scanner;

public class Page {

	public static void main(String[] args) {
//		int nPerPage = 7;
//		int result = 331;
//		int 결과 = result / nPerPage + 1;
//		if(result % nPerPage == 0) {
//			결과 = result / nPerPage;
//		}
//		System.out.println(결과+"페이지가 필요합니다.");	
		
		
//		int nPerPage = 7;
//		System.out.println("몇 개의 게시물을 표시할까요? (정수로 쓰세요.)");
//		Scanner scanner = new Scanner(System.in);
//		
//		int result = scanner.nextInt();
//		int result = 331;
//		int 결과 = result / nPerPage + 1;
//		if(result % nPerPage == 0) {
//			결과 = result / nPerPage;
//		}
//		System.out.println(결과+"페이지가 필요합니다.");	
		
		
//		Scanner scanner = new Scanner(System.in);
//		String inputString = scanner.nextLine();
//		
//		while(true) {
//			
//		System.out.println("몇 개의 게시물을 표시할까요? (정수로 쓰세요.)");
//		String nPerPage = 7;
//		String result = 331;
//		String 결과 = result / nPerPage + 1;
//		if(result % nPerPage == 0) {
//			결과 = result / nPerPage;
//		}
//		System.out.println(결과+"페이지가 필요합니다.");	

//		}
	
		
		int nPerPage = 7;
		Scanner scanner = new Scanner(System.in);
		while(true) {
//			input
			System.out.println("몇 개의 게시물을 표시할까요? (정수로 쓰세요.)");
			String inputString = scanner.nextLine();
//			if exit> -> exit
			if(inputString.contentEquals("exit")) {
				System.out.println("끝");
				break;
			}
			int result = scanner.nextInt();
			if(result == 0) {
				System.out.println("끝");
				break;
			}
//			String -> int
			int result1 = Integer.parseInt(inputString);
//			calculate page
			int 결과 = result1 / nPerPage;
			if(result1 % nPerPage != 0) {
				int 결과 = result1 / nPerPage + 1;
			}
			System.out.println(결과+"페이지가 필요합니다.");	

		}

	}

}