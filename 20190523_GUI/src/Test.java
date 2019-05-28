import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test {

	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400, 600));

		FlowLayout fl = new FlowLayout();
		fl.setAlignment(FlowLayout.LEFT);
		panel.setLayout(fl);

		//Border
		BorderLayout bl = new BorderLayout();
		panel.setLayout(bl);
//		JButton btNorth = new JButton("NORTH");
//		JButton btWest = new JButton("WEST");
//		JButton btCenter = new JButton("CENTER");
//		JButton btEast = new JButton("EAST");
//		JButton btSouth = new JButton("SOUTH");
//		panel.add(btNorth, BorderLayout.NORTH);
//		panel.add(btWest, BorderLayout.WEST);
//		panel.add(btCenter, BorderLayout.CENTER);
//		panel.add(btEast, BorderLayout.EAST);
//		panel.add(btSouth, BorderLayout.SOUTH);

//		JButton btx2 = new JButton("x2");
//		panel.add(btx2, BorderLayout.x2);

		
		JPanel panelNorth = new JPanel();

		//0~9 i
		for(int i = 0; i < 10; i++) {
			JButton bt0 = new JButton("Button " + i);
			panelNorth.add(bt0);
		}
		panel.add(panelNorth, BorderLayout.NORTH);

		//GridLayout
		GridLayout gl = new GridLayout(10, 5);		
		JPanel panelCenter = new JPanel();
		panelCenter.setLayout(gl);

		for(int i = 0; i < 50; i++) {
			JButton bt = new JButton("Button " + i);
			panelCenter.add(bt);
		}

		panel.add(panelCenter, BorderLayout.CENTER);

		frame.add(panel);

		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}