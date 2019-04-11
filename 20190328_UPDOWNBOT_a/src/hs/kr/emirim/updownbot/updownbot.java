package hs.kr.emirim.updownbot;

import java.util.Random;
import java.util.Scanner;

public class updownbot {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int rNumber = 50, count = 0;
		float temp=25;

		System.out.println("1~100까지 숫자 중 하나를 생각하세요.");
		System.out.println("숫자가 생각한 것보다 크다면 (DOWN)'0'을 작다면 (UP)'1'을 입력하고 맞으면 '2'을 입력하세요.");
		System.out.println("시작하려면 Enter를 누르세요");

		String e = sc.nextLine();

		while (true) {


			System.out.println(rNumber);

			int you = sc.nextInt();

			if (you==2) {
				break;
			} else if (you==1) {
				rNumber += temp;
			} else if (you==0) {
				rNumber -= temp;
			}

			count++;

			if(temp>0) temp /= 2.0;
			else temp*=2;

		} // while

		System.out.println(count + "번만에 맞췄습니다!!");

	}

}