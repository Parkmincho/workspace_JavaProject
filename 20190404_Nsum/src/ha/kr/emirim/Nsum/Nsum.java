package ha.kr.emirim.Nsum;

import java.util.Scanner;

public class Nsum {

	public static void main(String[] args) {
		
		//숫자 string으로 입력 <= 자릿수를 알기 위해 <= 0~자릿수-1까지 하나씩 잘라서 더함
		Scanner sc = new Scanner(System.in);
		String number = scanner.nextLine();
//		String number = null;
		//각 자릿수의 수를 더하기
		int length = number.length();
		int sum = '0';
		for(int i=0;i<length;i++) {
			//0~ 자릿수-1 까지 반봅
			//한글자씩 가져와서 숫자로 바꿈
			char n = number.charAt(i);
			
			//sum에 더함
			sum += n - '0';
		}
		//더한 값을 출력
		System.out.println("sum");
	}

}
