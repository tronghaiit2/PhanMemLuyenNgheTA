package listenpractisesystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Play {
	
	public static int part = 0;
	public static int totalTime = 0;
	public static long startTime = 0;
	
	ImageIcon img = new ImageIcon("D:\\Eclipse\\Image\\background.png");
	ImageIcon img0 = new ImageIcon("D:\\Eclipse\\Image\\PlayNow.png");
	ImageIcon img1 = new ImageIcon("D:\\Eclipse\\Image\\Play.png");
	ImageIcon img4 = new ImageIcon("D:\\Eclipse\\Image\\Back.png");
	
	JFrame f4 = new JFrame("Are you sure to play?");
	JLabel playnow = new JLabel("",img0,JLabel.CENTER);
	JButton play = new JButton("",img1);
	JButton back = new JButton("",img4);
	JLabel background = new JLabel("",img,JLabel.CENTER);
	
	public Play() {
		
		f4.setSize(540,720);
		f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f4.setLayout(null);
		f4.setVisible(true);
		f4.setLocationRelativeTo(null);
		
		f4.add(playnow);
		playnow.setBounds(50, 60, 425, 43);
		
		f4.add(back);
		back.setContentAreaFilled(false);
		back.setBounds(210, 400, 100, 100);
		back.setMnemonic(KeyEvent.VK_B);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f4.dispose();
	        	new Lesson();
		    }
		});
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		f4.add(play);
		play.setContentAreaFilled(false);
		play.setBounds(180, 160, 160, 160);
		play.setMnemonic(KeyEvent.VK_P);
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f4.dispose();
	        	startTime = System.currentTimeMillis();	
	        	Main.function = 1;
	        	ListenPractise.count = 1;
	        	ListenPractise.check();
	        	part = 3;
	        	new ListenPractise();
		    }
		});
		play.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		background.setBounds(0, 0, 540, 720);		
		f4.add(background);
	}
}	
