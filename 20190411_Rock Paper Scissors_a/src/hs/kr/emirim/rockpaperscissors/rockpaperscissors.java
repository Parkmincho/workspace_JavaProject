package hs.kr.emirim.rockpaperscissors;

public class rockpaperscissors {

	public static void main(String[] args) {
		int p = 1;
		//컴퓨터의 패를 구하자
		int c = makeComputer();
		//사용자의 패를 비교하자
		int result = compare(p, c);
		//결과 출력
		System.out.println(result);
		

	}
	
	private static int compare(p, c) {
		//
		return 0;
	}

	private static int makeComputer() {
		Random random = new Random();
		int c = rondom.nextInt(3-1+1)+1; //1~3의 양의 수
		return c;
	}
}
