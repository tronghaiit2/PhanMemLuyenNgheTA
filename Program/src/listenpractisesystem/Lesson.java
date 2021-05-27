package listenpractisesystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lesson {
	
	public static int ID = 0;
	
	ImageIcon img = new ImageIcon("D:\\Eclipse\\Image\\background.png");
	ImageIcon img0 = new ImageIcon("D:\\Eclipse\\Image\\Lesson.png");
	ImageIcon img1 = new ImageIcon("D:\\Eclipse\\Image\\Lesson 1.png");
	ImageIcon img2 = new ImageIcon("D:\\Eclipse\\Image\\Lesson 2.png");
	ImageIcon img3 = new ImageIcon("D:\\Eclipse\\Image\\Lesson 3.png");
	ImageIcon img4 = new ImageIcon("D:\\Eclipse\\Image\\Back.png");
	
	JFrame f3 = new JFrame("Choose Lesson");
	JLabel lesson = new JLabel("",img0,JLabel.CENTER);
	JLabel lesson_1 = new JLabel("",img1,JLabel.CENTER);
	JButton lesson1 = new JButton("LESSON 1");
	JButton demo1 = new JButton("DEMO 1");
	JLabel lesson_2 = new JLabel("",img2,JLabel.CENTER);
	JButton lesson2 = new JButton("LESSON 2");
	JButton demo2 = new JButton("DEMO 2");
	JLabel lesson_3 = new JLabel("",img3,JLabel.CENTER);
	JButton lesson3 = new JButton("LESSON 3");
	JButton demo3 = new JButton("DEMO 3");
	JButton back = new JButton("",img4);
	JLabel background = new JLabel("",img,JLabel.CENTER);

	public Lesson() {
		
		f3.setSize(540, 720);
		f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f3.setLayout(null);
		f3.setVisible(true);
		f3.setLocationRelativeTo(null);
		
		f3.add(lesson);
		lesson.setBounds(60, 50, 425, 43);
		
		f3.add(lesson_1);
		lesson_1.setBounds(170, 150, 185, 158);
		
		f3.add(back);
		back.setContentAreaFilled(false);
		back.setBounds(200, 540, 100, 100);
		back.setMnemonic(KeyEvent.VK_B);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f3.dispose();
	        	new Level();
		    }
		});
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		f3.add(lesson1);
		lesson1.setFont(new Font("Arial", Font.BOLD, 20));
		lesson1.setContentAreaFilled(false);
		lesson1.setBounds(170, 250, 185, 50);
		lesson1.setMnemonic(KeyEvent.VK_1);
		lesson1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ID = 1;
	        	f3.dispose();
	        	new Play();
		    }
		});
		lesson1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		f3.add(lesson_2);
		lesson_2.setBounds(20, 330, 208, 160);
		
		f3.add(lesson2);
		lesson2.setFont(new Font("Arial", Font.BOLD, 20));
		lesson2.setContentAreaFilled(false);
		lesson2.setBounds(20, 450, 208, 50);
		lesson2.setMnemonic(KeyEvent.VK_2);
		lesson2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ID = 2;
	        	f3.dispose();
	        	new Play();
		    }
		});
		lesson2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		f3.add(lesson_3);
		lesson_3.setBounds(300, 350, 208, 146);
		
		f3.add(lesson3);
		lesson3.setFont(new Font("Arial", Font.BOLD, 20));
		lesson3.setContentAreaFilled(false);
		lesson3.setBounds(300, 450, 208, 50);
		lesson3.setMnemonic(KeyEvent.VK_3);
		lesson3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ID = 3;
	        	f3.dispose();
	        	new Play();
		    }
		});
		lesson3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		
			f3.add(demo1);
			demo1.setBounds(213, 110, 100, 40);
			if (Level.ID == 1) {
				demo1.setToolTipText("Lesson 1: FM dials, Time: 52s");
			}
			else if(Level.ID == 2) {
				demo1.setToolTipText("Lesson 1: Appointments, Time: 43s");
			}
			else if(Level.ID ==	3) {
				demo1.setToolTipText("Lesson 1: Sports, Time: 82s");
			}

			f3.add(demo2);
			demo2.setBounds(75, 310, 100, 40);
			if (Level.ID == 1) {
				demo2.setToolTipText("Lesson 2: Jobs, Time: 36");
			}
			else if(Level.ID == 2) {
				demo2.setToolTipText("Lesson 2: Money, Time: 68");
			}
			else if(Level.ID ==	3) {
				demo2.setToolTipText("Lesson 3: Bookshelves, Time: 91");
			}
				
			f3.add(demo3);
			demo3.setBounds(352, 310, 100, 40);
			if (Level.ID == 1) {
				demo3.setToolTipText("Lesson 3: Weather, Time: 31");
			}
			else if(Level.ID == 2) {
				demo3.setToolTipText("Lesson 3: Items, Time: 35");
			}
			else if(Level.ID == 3) {
				demo3.setToolTipText("Lesson 3: places, Time: 72");
			}
			
			demo1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
		        	ID = 1;
					Demo.function = 2;   
		        	Demo.check();
		        	new Demo();
				}
			});
			demo1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			
			demo2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
		        	ID = 2;
					Demo.function = 2;   
		        	Demo.check();
		        	new Demo();
				}
			});
			demo2.setCursor(new Cursor(Cursor.HAND_CURSOR));
			
			demo3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
		        	ID = 3;
					Demo.function = 2;   
		        	Demo.check();
		        	new Demo();
				}
			});
			demo3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
	
		background.setBounds(0, 0, 540, 720);		
		f3.add(background);
	}
}