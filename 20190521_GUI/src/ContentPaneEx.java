import javax.swing.*;
import java.awt.*;

public class ContentPaneEx {
		ContentPaneEx() {
			setTitle("ContentPane과 JFrame 예제");//프레임의 타이틀달기
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Container contentPane = getContentPane();//컨켄트팬 알아내기
			conttentpaner.setBackground(Color.ORANGE);//오렌지색 배경 설정
			contentPane.setLayout(new FlowLayout());//컨텐트팬에 FlowLayout 배치관리자 달기
		}

	}


