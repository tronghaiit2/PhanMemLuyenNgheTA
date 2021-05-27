package listenpractisesystem;

public class Main {
	  
    static int function = 0;
    
	public static void main (String[] args) throws InterruptedException {
		new MainMenu();								
		while (true) {								
			Thread.sleep(400);						
			if(function == 1) {						
		        while(ListenPractise.count <= Play.part) {   
                    while (true) {
                    	ListenPractise.printTime();
            	        Thread.sleep(1000);				
				        if (ListenPractise.count > Play.part) 
					    {  
				        	function = 0 ;				
				    	    break;
				    	}
                    } 
		        }
			}
		} 
	}
}