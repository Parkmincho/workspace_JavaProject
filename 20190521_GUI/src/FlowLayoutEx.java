import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx {
	FlowLayoutEx() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();//컨텐트팬 알아내기
		
		//왼쪽정렬로, 수평 간격 30, 수직간경 40 팩셀로 배치하는 FlowLayout생성
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("add"));
	}
}
