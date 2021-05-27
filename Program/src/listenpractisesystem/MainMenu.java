package listenpractisesystem;

import java.awt.Cursor;
import java.awt.event.*;
import javax.swing.*;

public class MainMenu {
	
	ImageIcon img = new ImageIcon("D:\\Eclipse\\Image\\background.png");
	ImageIcon img0 = new ImageIcon("D:\\Eclipse\\Image\\ListenAndWrite.png");
	ImageIcon img1 = new ImageIcon("D:\\Eclipse\\Image\\Dragonfly.png");
	ImageIcon img2 = new ImageIcon("D:\\Eclipse\\Image\\Practise.png");
	ImageIcon img3 = new ImageIcon("D:\\Eclipse\\Image\\Score.png");
	ImageIcon img4 = new ImageIcon("D:\\Eclipse\\Image\\History.png");

	JFrame f1 = new JFrame("Main Menu");
	JLabel listenandwrite = new JLabel("",img0,JLabel.CENTER);
	JLabel dragonfly = new JLabel("",img1,JLabel.CENTER);
	JButton practise = new JButton("",img2);
	JButton yourscore = new JButton("",img3);
	JButton history = new JButton("",img4);
	JLabel background = new JLabel("",img,JLabel.CENTER);
	
	public MainMenu() {
		
		f1.setSize(540, 720);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setLocationRelativeTo(null);
		
		f1.add(listenandwrite);
		listenandwrite.setBounds(45, 60, 425, 86);
		
		f1.add(dragonfly);
		dragonfly.setBounds(120, 150, 280, 140);
		
		f1.add(practise);
		practise.setContentAreaFilled(false);
		practise.setBounds(170, 320, 188, 48);
		practise.setMnemonic(KeyEvent.VK_P);
		practise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        	f1.dispose();
	        	new Level();
		    }
		});
		practise.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		f1.add(yourscore);
		yourscore.setContentAreaFilled(false);
		yourscore.setBounds(170, 410, 188, 43);
		yourscore.setMnemonic(KeyEvent.VK_Y);
		yourscore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        	f1.dispose();
	        	new TotalScore();
		    }
		});
		yourscore.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		history.setContentAreaFilled(false);
		f1.add(history);
		history.setBounds(170, 500, 188, 43);
		history.setMnemonic(KeyEvent.VK_H);
		history.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        	f1.dispose();
	        	try {
					Chart.main(new String[] {});
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		    }
		});
		history.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		f1.add(background);
		background.setBounds(0, 0, 540, 720);	
	}
}
