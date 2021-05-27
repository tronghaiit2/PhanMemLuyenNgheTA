package listenpractisesystem;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

class Audio { 

    static Clip clip = null; 
    AudioInputStream audioInputStream; 
  
    // constructor to initialize streams and clip 
    public Audio() 
        throws UnsupportedAudioFileException, 
        IOException, LineUnavailableException  
    { 
    	String filePath = ListenPractise.filePath;
    	// create AudioInputStream object 
        audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile()); 
          
        // create clip reference 
        clip = AudioSystem.getClip(); 
          
        // open audioInputStream to the clip 
        clip.open(audioInputStream); 
        
        // loop audio automatically
        clip.loop(Clip.LOOP_CONTINUOUSLY); 	  
    }

    // Method to play the audio 
    public static void play()  
    {  
        clip.start();
    }
    
    // Method to stop the audio 
    public static void stop() 
    { 
        clip.stop(); 
        clip.close(); 
    } 
	public static void main(String[] args) {
	new ListenPractise();
	}
}
class AudioDemo { 

    static Clip clipdemo = null; 
    AudioInputStream audioInputStream; 
  
    public AudioDemo() 
        throws UnsupportedAudioFileException, 
        IOException, LineUnavailableException  
    { 
    	String filePathDemo = Demo.filePathDemo;
    	audioInputStream = AudioSystem.getAudioInputStream(new File(filePathDemo).getAbsoluteFile()); 
        clipdemo = AudioSystem.getClip(); 
        clipdemo.open(audioInputStream); 
        clipdemo.loop(0); 	  
    }

    public static void play() {  
        clipdemo.start();
    }
    
    public static void stop() { 
        clipdemo.stop(); 
        clipdemo.close(); 
    } 
}
