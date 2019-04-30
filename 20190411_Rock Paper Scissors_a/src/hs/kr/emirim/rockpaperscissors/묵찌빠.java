package hs.kr.emirim.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class 묵찌빠 {

	public static void main(String[] args) {
		boolean winPlayer = flase;
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String[] pae = {"찌", "빠", "묵"};
		String[] answer = { "졌다.","비겼다.", "이겼다."};
		//사용자의 입력을 받자 : 1. 가위 2. 바위 3. 보 0.끝
		System.out.println("가위바위보를 합시다. ");
		System.out.println("입력 (1 : 찌, 2 : 빠, 3 : 묵) : ");
		int p = sc.nextInt();

		int c=makeComputer();
		System.out.println("컴퓨터 생각하는 수 : "+  c);

		//비교
		int result=compare(p,c);
		//결과 출력

		System.out.println("사용자 : "+pae[p-1]+"\t컴퓨터 : " + pae[c-1]);

		System.out.println(answer[result+1]);
	}

	private static int compare(int p, int c) {
		// TODO Auto-generated method stub

		//if((p==1&&c==2) || (p==2&&c==3) || (p==3&&c==1))
		if((p+1)%3==c)
			return -1;
		//사용자 짐

		//else if((p==1&&c==1)||(p==2&&c==2)||(p==3&&c==3))
		else if(p==c)
			return 0;
		//비기면 다시
		//승패가 갈린다음에 비기면, 게임 끝. 결과 알려주기
		//사용자 비김
		else 
			return 1;
		//사용자 이김

	}

	private static int makeComputer() {
		Random random = new Random();
		int c= random.nextInt(3-1+1)+1;//1~3까지
		return c;
	}

}

