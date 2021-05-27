package listenpractisesystem;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TotalScore {
	
	ImageIcon img = new ImageIcon("D:\\Eclipse\\Image\\background.png");
	ImageIcon img0 = new ImageIcon("D:\\Eclipse\\Image\\Score.png");
	ImageIcon img1 = new ImageIcon("D:\\Eclipse\\Image\\TotalScore.png");
	ImageIcon img2 = new ImageIcon("D:\\Eclipse\\Image\\TotalTime.png");
	ImageIcon img3 = new ImageIcon("D:\\Eclipse\\Image\\Details.png");
	ImageIcon img4 = new ImageIcon("D:\\Eclipse\\Image\\Back.png");
	
	JFrame f7 = new JFrame("Total Score");
	JLabel yourscore = new JLabel("",img0,JLabel.CENTER);
	JLabel totalscore = new JLabel("",img1,JLabel.CENTER);
	JLabel printscore = new JLabel(String.valueOf(DetailScore.totalScore)+" điểm");
	JLabel totaltime = new JLabel("",img2,JLabel.CENTER);
	JLabel printtime = new JLabel(String.valueOf(GetScore.getTime())+ " giây");
	JLabel detail = new JLabel("",img3,JLabel.CENTER);
	JButton details = new JButton("DETAILS");
	JButton back = new JButton("",img4);
	JLabel background = new JLabel("",img,JLabel.CENTER);
	
	public TotalScore () {
		
		f7.setSize(540,720);
		f7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f7.setLayout(null);
		f7.setVisible(true);
		f7.setLocationRelativeTo(null);
		
		f7.add(yourscore);
		yourscore.setBounds(50, 60, 425, 43);
		
		f7.add(totalscore);
		totalscore.setBounds(120, 150, 162, 30);
		
		f7.add(printscore);
		printscore.setFont(new Font("Arial", Font.BOLD, 20));
		printscore.setBounds(300, 150, 200, 30);
		
		f7.add(totaltime);
		totaltime.setBounds(120, 200, 162, 30);
		
		f7.add(printtime);
		printtime.setFont(new Font("Arial", Font.BOLD, 20));
		printtime.setBounds(300, 200, 200, 30);
		
		f7.add(detail);
		detail.setBounds(190, 320, 153, 116);
		
		f7.add(details);
		details.setFont(new Font("Arial", Font.BOLD, 20));
		details.setContentAreaFilled(false);
		details.setBounds(190, 270, 153, 50);
		details.setMnemonic(KeyEvent.VK_D);
		details.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f7.dispose();
 	 	        new DetailScore();
		    }
		});
		details.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		f7.add(back);
		back.setContentAreaFilled(false);
		back.setBounds(220, 440, 100, 100);
		back.setMnemonic(KeyEvent.VK_B);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f7.dispose();
	 	        new MainMenu();
		    }
		});
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
	 	
		background.setBounds(0, 0, 540, 720);		
		f7.add(background);
	}
}
