package packet_tracker;

import java.util.List;
import java.util.Scanner;

public class result extends Thread{
	public void run() {
		Dijkstra d = new Dijkstra();
		
		  Scanner S = new Scanner(System.in);
		    Vertex_point[] vNew=d.calldij();
			int[] start = new int[100000];
			
			for(int a=0; a<100000; a++){
				start[a] = (int)(Math.random()*5-Math.random()*6);
				
				while(start[a]> 2){
					start[a] = (int)(Math.random()*5-Math.random()*6);
				}
				
			}
			
			
		  while(true){
			  
				 System.out.println("Enter ID");
				// System.out.println("Tracking ID" + "  " + S);
				 int input;
				 input= S.nextInt();
				 String Status = new String();
				
				 System.out.println("******************************************");
				System.out.println("Tracking ID : " +  input);
			    System.out.println("");
			    
				System.out.println("Source      : " + d.getSrcCities(input));
				
				System.out.println("Destination : " + d.getDesCities(input));
				
				List path = d.pathOf(d.SrcCity[input],d.DestCity[input],vNew);
			//	if((path.size()-start[input]) ==0) start[input]--;
				
			int pres = (int) (Database.time-start[input])/(path.size()-start[input]);
				
				if (pres > path.size()-1) pres = path.size()-1 ; 
				
				
				System.out.println("Present     : " + path.get(pres)); 
				
				if(pres< path.size()-1) Status = "In transit";
				if(pres == path.size()-1) Status = "Delivered";
				System.out.println("Status      : " + Status);
			
				 System.out.println("**********************************************");
				  }
		
	}
	
}
