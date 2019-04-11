package hs.kr.emirim.parkingfee;

public class parkingfee01 {
	public static void main(String[] args) {
		//분은 입력받기
		int Mintes = 52;
		int fee = 0;
		int minutes = 0;
		if(minutes <= 20) {
			// <= 30 이면 , 1500
			fee = 1500;
		}
		else {
		//아니고, 
		//분  -30, 요금 += 1500
			minutes = Mintes - 30;
			fee += 1500;
			//요금 += (분/10)*1000
			fee += (Mintes/10)*1000;
			//분 %10 != 0, 요금 += 1000
			if(minutes%10 != 0) {
				fee += 1000;
			}
		}
		System.out.println("주차요금은 " + fee + "원입니다.");
	}
}