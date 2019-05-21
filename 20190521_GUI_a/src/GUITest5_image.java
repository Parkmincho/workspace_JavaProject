import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUITest5_image {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(500, 333));
		
		//ImageIcon, JLabel
		ImageIcon chen = new ImageIcon("src/images/첸1.jpg");
		JLabel imageLable = new JLabel(chen);
		
		//ImageIcon, JButton
		ImageIcon chanyeol = new ImageIcon("src/images/찬열.jpeg");
		
		//ImageIcon 크기 수정
		ImageIcon smallChanyeol = new ImageIcon(chanyeol.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
		JButton imageButton = new JButton(chanyeol);
		imageButton.setRolloverIcon(chen); //마우스 올리면
		imageButton.setPressedIcon(chanyeol); //마우스 클릭하면
		
		
		panel.add(imageButton);
		panel.add(imageLable);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}