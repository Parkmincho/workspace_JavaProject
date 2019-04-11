package kr.hs.emirim.EX1;


public class EX1 {

	public static void main(String[] args) {
		
		//1, strData에 'I LOVE MIRIM MEISTER'를 할당한 후 문자열 개수를 출력하시오
		String strData1 = "I LOVE MIRIM MEISTER";
		System.out.println("strData1.length() = " + strData1.length());
		
		//2. str 변수에 'I LOVE MEISTER'를 할당한 후, 출력하시오
		String str = "I LOVE MIRIM MEISTER";
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println();
		
		
		// 3. String 객체 R1, R2, R3를 생성한 후, 각각 'JAVA', 'JAVA, 'java'를 할당하시오.
		String R1 = new String("JAVA");
		String R2 = new String("JAVA");
		String R3 = new String("java");
		System.out.println("R1 == R2 --> " + (R1==R2));
		System.out.println("R1.equals(R2) --> " + (R1.equals(R2)));
		System.out.println("R1 == R3 --> " + (R1==R3));
		System.out.println("R1.equals(R3) --> " + (R1.equals(R3)));
		System.out.println();
					
		// 4. char형 ch에 'A'를 할당하고, String형 strData2에 "A"를 대입하시오. 그리고 ch값을 String형 strData3에 대입한 후, 두 내용이 같은지 비교하여 출력하시오. (valueOf())
		char ch = 'A';
		String strData21 = "A";
		String strData3;
		strData3 = String.valueOf(ch);
		if(strData21.equals(strData3))
			System.out.println("같음");
		else
			System.out.println("다름");
		System.out.println();
		
		//5. strData에 'I LOVE MIRIM MEISTER'대입한 후 공백제거 한 값을 strData2에 대입하시오
		//그리고 strData1과 strData2의 내용이 같은지 비교하여 출력하시오
		String strData2;
		strData2 = strData1.trim();
		System.out.println("strData2.trim() -> "             +             strData2);
		if( strData1.contentEquals( strData2 ))
			System.out.println("같음");
		else System.out.println("다름");
		System.out.println();
		
		//6. strData에 'I LOVE MIRIM MEISTER'를 할당한 후, MIRIM만 추출하여 strData5에 대입한후 출력하시오
		String strData5;
		strData5 = strData1.substring(7,12);
		System.out.println("strData3.substring(7,12) ->" + strData5);
		System.out.println();
		
		//7. strData에 'I LOVE MIRIM MEISTER'를 할당한 후, LOV만 추출하여 strData4에 대입한 후 출력하시오.
		String strData4;
		strData4 = strData1.substring(2,5);
		System.out.println("strData3.substring(2,5) ->" + strData4);
		System.out.println();
		
		//9.StringBuffer 객체 sb1에 java programming을 넣고,
		//sb2에 project를 넣은 후, sb1에 "project"문자열을 추가하여 str1에 넣고, sb1에 sb2를 추가하여 str2에 대입한 후 출력하시오
		StringBuffer sb1 = new StringBuffer(" Java Programming");
		StringBuffer sb2 = new StringBuffer(" Project");
		String str23 = null;
		StringBuffer str1 = null;
		StringBuffer str2 = null;
		str1 = sb1.append(" Project");
		str2 = sb1.append(sb2);
		System.out.println("sb1 = " + sb1);
		System.out.println("sb2 = " + sb2);
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println();
		
		//10. StringBuffer 객체 sb1에 java programming을 생성한 후 java를 JAVA로 치환한 후 sb2에 할당한 후 출력하시오.
		sb2 = sb1.replace(0, 5, "JAVA");
		System.out.println("sb2 = " + sb2);
		System.out.println();
		
		//11. StringBuffer 객체 sb1에 java programming을 생성한 후 거꾸로 출력한 문자열을 sb3에 할당한 후 출력하시오.
		sb2 = sb1.reverse();
		System.out.println("sb2 = " + sb2);
		System.out.println();
		
		//12. StringBuffer 객체 sb1에 java programming을 생성한 후 모두 대문자로 출력하시오
		str23 = sb1.toString();
		System.out.println("str23.toUpperCase() = " + str23.toUpperCase());
		System.out.println();
		
		// 13. Integer객체 in1에 100, Integer객체 in2에 100, Integer객체 in3에 200을 넣고 in1과 in2의 값을 비교하고. in1과 in3룰 비교하여 출력하시오.
		Integer in1 = new Integer(100);
		Integer in2 = new Integer(100);
		Integer in3 = new Integer(200);
		System.out.println("in1.equals(in2)--> " + (in1.equals(in2)));
		System.out.println("in1.equals(in3)--> " + (in1.equals(in3)));
		System.out.println();

		// 14. Integer객체 wrapi생성하여 100을 넣고, Double객체 wrapd를 생성하여 55.7를 넣고 I=100, d=55.7인 상태에서 Integer.toString(i)+Double.toString(d)를
		// 계산하여 출력하시오. 또한 wrapi.toSting()+wrapd.toString()을 계산하여 출력하시오.
		Integer wrapi = new Integer(100);
		Double wrapd = new Double(55.7);
		int i = 100;
		double d = 55.7;
		System.out.println(i + d);
		System.out.println(Integer.toString(i) + Double.toString(d));
		System.out.println(wrapi.toString() + wrapd.toString());
		System.out.println();

		// 15. String형 stri=123456, std=123.56을 넣은 후 stri와 strd를 wrapper형으로 변환하여 출력하고, stri와 strd를 더한 결과를 출력하시오.
		String stri = "123456";
		String strd = "123.56";
		System.out.println(Integer.valueOf(stri));
		System.out.println(Double.valueOf(strd));
		System.out.println(Integer.valueOf(stri) + Double.valueOf(strd));
		System.out.println();

		// 16. String형 a=10, b=20을 넣은 후 합과 평균을 구하여 출력하시오. (평균: float)
		String a = "10", b = "20";
		int sum = 0;
		float average = 0;
		System.out.println("input data: " + a + " "  + b );
		int c = Integer.parseInt(a);
		int f = Integer.parseInt(b);
		sum = c + f;
		average = sum/2;
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println("평균 = " + average);
		System.out.println();
		
		//17. 63/ -63/ 63.5/ -63.5의 절대값을 출력하시오.
		System.out.println(Math.abs(63));
		System.out.println(Math.abs(-63));
		System.out.println(Math.abs(63.5));
		System.out.println(Math.abs(-63.5));
		System.out.println();
		
		//18. 63/ 63.3/ 63.5/ -63.4/ -63.5/ -63.6을 round 함수를 써서 출력하시오.
		System.out.println(Math.round(63));
		System.out.println(Math.round(63.3));
		System.out.println(Math.round(63.5));
		System.out.println(Math.round(-63.4));
		System.out.println(Math.round(-63.5));
		System.out.println(Math.round(-63.6));
		System.out.println();
		
		//19. 6 , 3 / 6.0f, 3.0f / 6.0 , 3.0 / -6.0 , 3.0 을 pow함수를 써서 출력하시오
		System.out.println(Math.pow(6, 3));
		System.out.println(Math.pow(6.0f, 3.0f));
		System.out.println(Math.pow(6.0, 3.0));
		System.out.println(Math.pow(-6.0, -3.0));
		System.out.println();
		
		//20. 9, 9.0f, 9.0, -9.0 의 제곱근을 구하시오.
		System.out.println(Math.sqrt(9));
		System.out.println(Math.sqrt(9.0f));
		System.out.println(Math.sqrt(9.0));
		System.out.println(Math.sqrt(-9.0));
		System.out.println();
		
		// 21. 랜덤값을 구하는 random() 메소드를 사용하여 다음을 구하시오.
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println((int)Math.random()*5);
		System.out.println((int)(Math.random()*5));
		System.out.println((int)Math.random()*10);
		System.out.println((int)(Math.random()*100));
		System.out.println();
		
	}

}
