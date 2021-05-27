package listenpractisesystem;

import java.awt.event.*;
import javax.swing.*;
import java.awt.Cursor;
import java.awt.Font;

public class Level {

	public static int ID = 0;
	
	ImageIcon img = new ImageIcon("D:\\Eclipse\\Image\\background.png");
	ImageIcon img0 = new ImageIcon("D:\\Eclipse\\Image\\Level.png");
	ImageIcon img1 = new ImageIcon("D:\\Eclipse\\Image\\Level 1.png");
	ImageIcon img2 = new ImageIcon("D:\\Eclipse\\Image\\Level 2.png");
	ImageIcon img3 = new ImageIcon("D:\\Eclipse\\Image\\Level 3.png");
	ImageIcon img4 = new ImageIcon("D:\\Eclipse\\Image\\Back.png");
	
	JFrame f2 = new JFrame("Choose Level");
	JLabel level = new JLabel("",img0,JLabel.CENTER);
	JLabel level_1 = new JLabel("",img1,JLabel.CENTER);
	JButton level1 = new JButton("LEVEL 1");
	JLabel level_2 = new JLabel("",img2,JLabel.CENTER);
	JButton level2 = new JButton("LEVEL 2");
	JLabel level_3 = new JLabel("",img3,JLabel.CENTER);
	JButton level3 = new JButton("LEVEL 3");
	JButton back = new JButton("", img4);
	JLabel background = new JLabel("",img,JLabel.CENTER);
	
	public Level() {

		f2.setSize(540, 720);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f2.setLayout(null);
		f2.setVisible(true);
		f2.setLocationRelativeTo(null);
		
		f2.add(level);
		level.setBounds(50, 60, 425, 43);
		
		f2.add(level_1);
		level_1.setBounds(180, 110, 160, 160);
		
		
		f2.add(back);
		back.setContentAreaFilled(false);
		back.setBounds(200, 520, 100, 100);
		back.setMnemonic(KeyEvent.VK_B);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        	f2.dispose();
	        	new MainMenu();
		    }
		});
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		f2.add(level1);
		level1.setFont(new Font("Arial", Font.BOLD, 20));
		level1.setContentAreaFilled(false);
		level1.setBounds(190, 260, 120, 40);
		level1.setMnemonic(KeyEvent.VK_1);
		level1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ID = 1;
	        	f2.dispose();
	        	new Lesson();
		    }
		});
		level1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		f2.add(level_2);
		level_2.setBounds(20, 280, 170, 170);
		
		f2.add(level2);
		level2.setFont(new Font("Arial", Font.BOLD, 20));
		level2.setContentAreaFilled(false);
		level2.setBounds(60, 430, 120, 40);
		level2.setMnemonic(KeyEvent.VK_2);
		level2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ID = 2;
	        	f2.dispose();
	        	new Lesson();
		    }
		});
		level2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		f2.add(level_3);
		level_3.setBounds(330, 270, 168, 198);
		
		f2.add(level3);
		level3.setFont(new Font("Arial", Font.BOLD, 20));
		level3.setContentAreaFilled(false);
		level3.setBounds(330, 450, 120, 40);
		level3.setMnemonic(KeyEvent.VK_3);
		level3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ID = 3;
	        	f2.dispose();
	        	new Lesson();
		    }
		});
		level3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		background.setBounds(0, 0, 540, 720);		
		f2.add(background);
	}	
}
