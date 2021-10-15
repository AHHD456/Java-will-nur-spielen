package name.panitz.ludens.animation.game;
import java.awt.Color;

import javax.swing.*;



public class FirstPanel extends JPanel {

	@Override public void paintComponent(java.awt.Graphics g) {

		g.setColor(Color.red);
		g.fillRect(30, 50, 45, 80);
		
	}
	public static void main(String[] args) {
		JFrame  f=new JFrame("title");
		f.add(new FirstPanel());
		f.pack();
		f.setVisible(true);
	
		
		
}
}
