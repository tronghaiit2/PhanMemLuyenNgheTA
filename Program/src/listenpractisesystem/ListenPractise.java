package listenpractisesystem;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ListenPractise {
	
	static int count = 1;
	static JFrame f5 = null;
	static String filePath = null;
	static String timeString = null;
	static JButton playtimer = null;
	static long displayMinutes = 0;
    static long displaySeconds = 0;
    
   	static char ch;
    static String str = "";
    static int iCount = 0;
   	static int check = 0;
   	static JTextArea ta;
   	static JLabel [] t;
   	
   	ImageIcon img0 = new ImageIcon("D:\\Eclipse\\Image\\ListeningPractise.png");
	ImageIcon img = new ImageIcon("D:\\Eclipse\\Image\\Back.png");
    JButton back = new JButton("", img);
   	JLabel background = new JLabel("",img0,JLabel.CENTER);
   	
	public ListenPractise() {
		
    	f5 = new JFrame("Practise");  
    	f5.setSize(540, 720);  
	    f5.setLayout(null);  
	    f5.setVisible(true);  
	    f5.setLocationRelativeTo(null);
		background.setBounds(0, 0, 540, 720);
		
		f5.add(back);
		back.setContentAreaFilled(false);
		back.setBounds(200, 560, 100, 100);
		back.setMnemonic(KeyEvent.VK_B);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Back is ok!");
	            f5.dispose();
	            Audio.stop();
	            new Play();
		    }
		});
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));

	    playtimer = new JButton();  
	    f5.add(playtimer);
	    playtimer.setContentAreaFilled(false);
	    playtimer.setBounds(140, 40, 100, 25);  
       
	    ta = new JTextArea();
		ta.setFont(new Font("Arial", Font.BOLD, 18));
		ta.setBounds(40, 390, 430, 145);

		f5.add(ta);
		t = new JLabel[28];
		for(int i = 0; i < 28; i++) {
			char c = (char)(97 + i);
			if (i == 26) c = (char)39;
			if (i == 27) c = (char)46;
			String s = Character.toString(c);
			t[i] = new JLabel(s);
			t[i].setBounds(50 + 80*(i%6), 67 + 57*(i/6), 60,60);
			t[i].setFont(new Font("Arial", Font.BOLD, 24));
			f5.add(t[i]);
		}
		
		f5.add(background);
		f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		checkInput();
	}

    public static void check() {	
		filePath = QueryData.view();
		try { 
			new Audio();
		} catch(Exception e) {
		  e.printStackTrace();
		}
	}
    
    public static void checkInput() {
    	ta.addKeyListener(new KeyListener() {
    		@Override
    		public void keyTyped(KeyEvent e) { }
    			
    		@Override
    		public void keyReleased(KeyEvent e) {
    			byte[] result = new byte[200];
    			try {
    				result = FileProcess.readCharacter();
    			} catch (SQLException e1) {
    			  e1.printStackTrace();
    			}
    			ch = (char)result[iCount];
    			iCount++;
    			int num = FileProcess.numByte;
    			System.out.println(num);
    			System.out.println(iCount);
    			int ia = 0;
    			while(ia < num) {
    				System.out.print((char) result[ia]);
    				ia++;
    			}
    			System.out.println();
    			System.out.println(ch);
    			System.out.println(str + Character.toString(ch));
    			
    			if (e.getKeyChar() == ' ' && (ta.getText().toString().toLowerCase())
    					.equals((str + Character.toString(ch).toLowerCase()))) {
    				ta.setText("");
    				str = "";
    				iCount++;
    			}
    			if (!Character.toString(e.getKeyChar()).toLowerCase().equals(Character.toString(ch).toLowerCase())) {
    				if(ta.getText().toString().length()>0) ta.setText(ta.getText().substring(0, ta.getText().length() - 1));
    			}
    					
    			if ((ta.getText().toString().toLowerCase()).equals((str + Character.toString(ch).toLowerCase()))) {
    				str += Character.toString(ch).toLowerCase();
    				if(iCount >= num) {
    					Audio.stop();
    					iCount = 0;
    					str="";
    					count++;
    					if(count > Play.part) {
    						ListenPractise.dispose();	
    						new Result();
    					}
    					else {
    						System.out.println("Next is ok!");
    						Audio.stop();
    						check();
    						ta.setText("");
    					}
    				}							
    			}		
    			else iCount--;				
    		}
    			
    		@Override
    		public void keyPressed(KeyEvent e) {
    			byte[] result = new byte[200];
    			try {
    				result = FileProcess.readCharacter();
    			} catch (SQLException e1) {
    			  e1.printStackTrace();
    			}
    			t[check].setEnabled(true);
    			ch = (char)result[iCount];
    			char c = e.getKeyChar();
    			if (e.getKeyChar() >= 'A' && e.getKeyChar() <= 'Z')
    				c += 32;
    			try {				
    				System.out.println(c + "!");
    				if (Character.toString(c).toLowerCase().equals((Character.toString(ch).toLowerCase())) == false) {						
    					for(int i = 0;i <= 25; i++) {						
    						if(e.getKeyCode() == 8) break;						
    						if (t[i].getText().toString().toLowerCase().equals(Character.toString(c))) {
    							t[i].setEnabled(false); 
    							check = i;
    							break;
    						}			
    					}					
    				}
    			} catch(Exception ex) { }				
    		}});	
    }
    
    public static void printTime(){  
    	long timepassed = System.currentTimeMillis() - Play.startTime;
        long secondspassed = timepassed/1000;
        displayMinutes = secondspassed/60;
        displaySeconds = secondspassed%60;
        timeString = "00 : " + String.valueOf(displayMinutes) + " : " + String.valueOf(displaySeconds);
    	playtimer.setText(timeString);
    	}
    
    public static void dispose() {
    	f5.dispose();
    }
}

