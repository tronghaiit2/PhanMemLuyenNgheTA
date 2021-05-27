package listenpractisesystem;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException; 
import javax.sound.sampled.UnsupportedAudioFileException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Demo {
	
	public static int function = 0;
	public static int count = 0;
	static String s1, s2, s3, filePathDemo; 

	JFrame f10 ;
	JButton back;
	
	 public Demo() {
	    	f10 = new JFrame();  
	    	f10.setSize(400, 200);  
		    f10.setLayout(null);  
		    f10.setVisible(true);  
		    f10.setLocationRelativeTo(null);
		    
		    JLabel content = new JLabel("You're listening Demo!");
		    content.setBounds(50,20,150,20);
		    back = new JButton("Back");
		    back.setBounds(150, 80, 100, 40);
		    f10.add(back);
		    f10.add(content);

		    back.addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		        	System.out.println("Back is ok!");
		            f10.dispose();		            		            
		            AudioDemo.stop();
		         }	
		    });
		    back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		    
		    
	 		}
	 public static void check() {	
			s1 = String.valueOf(Level.ID);
			s2 = String.valueOf(Lesson.ID);
			s3 = String.valueOf(count);
			
			filePathDemo = "D:\\Eclipse\\AudioEdited\\level "+s1+"\\lesson "+s2+"\\demo"+".wav";

			try {
				new AudioDemo();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				e.printStackTrace();
			}
		}
}
