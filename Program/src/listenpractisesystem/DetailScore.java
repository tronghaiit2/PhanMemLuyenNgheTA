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

public class DetailScore {	
	
	static int [][] result = GetScore.getHighScore();
	static int totalScore = result[0][0] + result[0][1] + result[0][2]+
							result[1][0] + result[1][1] + result[1][2]+
							result[2][0] + result[2][1] + result[2][2];
	
	ImageIcon img = new ImageIcon("D:\\Eclipse\\Image\\HighScore.png");
	ImageIcon img0 = new ImageIcon("D:\\Eclipse\\Image\\Back.png");
	
	JFrame f8 = new JFrame("Detail Score");
	JLabel total = new JLabel(String.valueOf(totalScore));	
	JButton back = new JButton("",img0);
	JLabel background = new JLabel("",img,JLabel.CENTER);
	
	public DetailScore () {
		
		f8.setSize(540,720);
		f8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f8.setLayout(null);
		f8.setVisible(true);
		f8.setLocationRelativeTo(null);
		 
        f8.add(total);	
        total.setBounds(410, 140, 150, 30);	
        total.setFont(new Font("Arial", Font.BOLD, 20));
        
        for (int i = 0; i < 3; i++)
        	for( int j = 0; j < 3; j++) {
        		JLabel lesson = new JLabel(String.valueOf(result[i][j]));	 
                f8.add(lesson);	
                lesson.setBounds(410, 205 + (2*i+j)*30 + 70 *i, 150, 30);	
                lesson.setFont(new Font("Arial", Font.BOLD, 16));
        	}
        
		f8.add(back);
		back.setContentAreaFilled(false);
		back.setBounds(210, 570, 100, 100);
		back.setMnemonic(KeyEvent.VK_B);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f8.dispose();
	        	new MainMenu();
		    }
		});
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		background.setBounds(0, 0, 540, 720);		
		f8.add(background);
	}
}
