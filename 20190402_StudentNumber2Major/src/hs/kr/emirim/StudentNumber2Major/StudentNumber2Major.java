package hs.kr.emirim.StudentNumber2Major;

import java.util.Scanner;

public class StudentNumber2Major {

	public static void main(String[] args) {
		//학번 입력
		Scanner scanner = new Scanner(System.in);
		System.out.println("학과를 구할 학번을 입력하세요 : ");
		String studentNumber = scanner.nextLine();

		String grade = studentNumber.substring(0, 1);
		//char grade = studentNumber.charAt(0);
		String classroom = studentNumber.substring(1, 2);

		char gradeCh = 0;
		//학과 출력
		//학년이 1, 2학년이면
		if(grade.contentEquals("1") || grade.contentEquals("2"))

			//반이 1, 2반이면 "뉴미디어소프트웨어과"
			if(classroom.contentEquals("1") || classroom.equals("2"))
				System.out.println("뉴미디어소프트웨어과");

		//반이 3, 4반이면 "뉴미디어웹솔루션과"
			else if(classroom.contentEquals("3") || classroom.equals("4"))
				System.out.println("뉴미디어웹솔루션과");

		//반이 5, 6반이면 "뉴미디어 디자인과"
			else if(classroom.contentEquals("5") || classroom.equals("6"))
				System.out.println("뉴미디어디자인과");
	

	//학년이 3학년이면
	else if(gradeCh == '3') {
		int classroomCh = 0;
		switch(classroomCh) {
		case '1': case '2':

			//반이 1, 2반이면 "뉴미디어소프트웨어과"
			System.out.println("인터렉티브미디어과");

			//반이 3, 4반이면 "뉴미디어웹솔루션과"
		case '3': case '4':
			System.out.println("뉴미디어웹솔루션과");

			//반이 5, 6반이면 "뉴미디어 디자인과"
		case '5': case '6':
			System.out.println("뉴미디어디자인과");
		}
	}

}
}
