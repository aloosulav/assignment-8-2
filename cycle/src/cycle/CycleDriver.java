package cycle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CycleDriver  {
	
		    public static void main(String args[]) throws IOException{
		    	 
		    		  
		    	
		          Scanner key = new Scanner(System.in);
		          System.out.println("Enter Number of Wheels of Cycle:");
		         int numberOfWheels = key.nextInt();
		         
		          System.out.println("Enter Weight of Cycle :");
		          int weight = key.nextInt();
		         
		          Cycle C = new Cycle(numberOfWheels,weight);
		          
		          File F = new File("Cycle.txt");
		         
		          if (!F.exists()){
		        	  F.createNewFile();		         		  
		        	  }
		           PrintWriter PW = new PrintWriter(F);
		         
		           PW.println("Number Of wheels :"+C.getNumberOfWheels());
		           PW.println("Weight "+C.getWeight());
		      
		           PW.close();
		           
		    }
		    }
		    
		    

