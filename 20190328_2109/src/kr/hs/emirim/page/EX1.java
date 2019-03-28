package kr.hs.emirim.page;

public class EX1 {

	public static void main(String[] args) {
		
		String strData1 = "I LOVE MIRIM MEISTER";
		System.out.println("strData1.length() = " + strData1.length());
		
		String str = "I LOVE MIRIM MEISTER";
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println();
		
		String strData2;
		strData2 = strData1.trim();
		System.out.println("strData2.trim() -> "             +             strData2);
		if( strData1.contentEquals( strData2 ))
			System.out.println("같음");
		else System.out.println("다름");
		
		String strData3;
		strData3 = strData1.substring(7,12);
		System.out.println("strData3.substring(7,12) ->" + strData3);
		
		String strData4;
		strData4 = strData1.substring(2,5);
		System.out.println("strData3.substring(2,5) ->" + strData4);
	}

}
