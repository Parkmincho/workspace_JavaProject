package hs.kr.emirim.parkingfee;

public class parkingfee {
	public static void main(String[] args) {
		int fee;
		//분은 입력받기
		int parkingMintes = 41;
		//0이상 30분 이하면, 2,000원
		if(0 <= parkingMintes && parkingMintes <= 30) {
			fee = 2000;
		}
		else {
			//봄이 의견
			int 십의자리 = parkingMintes/10;
			int 일의자리 = parkingMintes%10;
			fee = (십의자리-1)*1000;
			if(일의자리 >= 1)
				fee += 1000;
		}
	}
}
