package listenpractisesystem;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import java.sql.Connection;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Result{
	static long displayMinutes;
	static long displaySeconds;
	static int endTime = 0;
    static int score = 0;   
    static String result;
    
    ImageIcon img = new ImageIcon("D:\\Eclipse\\Image\\background.png");
	ImageIcon img0 = new ImageIcon("D:\\Eclipse\\Image\\YourResult.png");
	ImageIcon img1 = new ImageIcon("D:\\Eclipse\\Image\\YourScore.png");
	ImageIcon img2 = new ImageIcon("D:\\Eclipse\\Image\\YourTime.png");
	ImageIcon img3 = new ImageIcon("D:\\Eclipse\\Image\\Next.png");
	ImageIcon img4 = new ImageIcon("D:\\Eclipse\\Image\\Dragonfly.png");
    
	JFrame f6 = new JFrame("Result");
	JLabel yourresult = new JLabel("",img0,JLabel.CENTER);
	JLabel yourscore = new JLabel("",img1,JLabel.CENTER);
	JLabel yourtime = new JLabel("",img2,JLabel.CENTER);
	JLabel dragonfly = new JLabel("",img4,JLabel.CENTER);
	JButton next = new JButton("", img3);
	JLabel background = new JLabel("",img,JLabel.CENTER);
	
    public Result() {	
    	endTime = (int) ((System.currentTimeMillis() - Play.startTime)/1000); 
		displayMinutes = endTime/60;
		displaySeconds = endTime%60;
		result = String.valueOf(displayMinutes)+"' "+ String.valueOf(displaySeconds)+"''"; 
	    score = 10*(11 - endTime/(QueryData.LengthOfSound())); 
	    FileProcess.writeScore();
	    insertScore();
	    
    	f6.setSize(540,720);
    	f6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	f6.setLayout(null);
    	f6.setVisible(true);
    	f6.setLocationRelativeTo(null);	
    	
		f6.add(yourresult);
		yourresult.setBounds(50, 60, 425, 43);
		
		f6.add(yourscore);
		yourscore.setBounds(120, 150, 162, 30);
		
		JLabel printscore = new JLabel(String.valueOf(score));
		f6.add(printscore);
		printscore.setFont(new Font("Arial", Font.BOLD, 20));
		printscore.setBounds(300, 150, 80, 30);
		
		f6.add(yourtime);
		yourtime.setBounds(120, 200, 162, 30);
		
		JLabel printtime = new JLabel(result);
		f6.add(printtime);
		printtime.setFont(new Font("Arial", Font.BOLD, 20));
		printtime.setBounds(300, 200, 80, 30);
		
		f6.add(dragonfly);
		dragonfly.setBounds(120, 420, 290, 150);
		
		f6.add(next);
		next.setContentAreaFilled(false);
		next.setBounds(190, 280, 120, 120);
		next.setMnemonic(KeyEvent.VK_N);
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Play.part = 0;
		 		Play.startTime = 0;
		 		Play.totalTime = 0;
		 		ListenPractise.count = 1;
		 		ListenPractise.displayMinutes = 0;
		 		ListenPractise.displaySeconds = 0;
		 	    f6.dispose();
		 	    new MainMenu();
		    }
		});
		next.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		background.setBounds(0, 0, 540, 720);		
		f6.add(background);
    }
    
    public static void insertScore() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date1 = new Date(); 
		String stringDate = dateFormat.format(date1);

		try {
			Connection con = Database.getConnection();
			Statement stm = con.createStatement();
			String sql = "insert into score(level,lesson,score,time,Date_time) "
					+ "values("+Level.ID+","+Lesson.ID+"," + score + "," + endTime + ","
					+ "str_to_date('"+ stringDate  +"','%Y-%m-%d %H:%i:%s'));";
					
			stm.executeUpdate(sql); 
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}