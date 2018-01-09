package packet_tracker;

public class Database   {
	 
	
	public static double time = 0;
	
	
	
	 
	
	public  static void main(String[] args) {
	  
		result o = new result();
	    o.start();
	    
	    while(true){
	    	time++;
	    	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }
		
	 }
}
