import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI {

	public static void main(String[] args) {
		JFrame frame = new JFrame("급식");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(700, 500));
		
		JButton beakground = new JButton();
		
		
		panel.add(beakground);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
