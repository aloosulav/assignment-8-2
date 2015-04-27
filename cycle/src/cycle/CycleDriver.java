package cycle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CycleDriver  {
	
		    public static void main(String args[]){
		    	 
		    		  
		    	
		          Scanner key = new Scanner(System.in);
		          System.out.println("Enter Number of Wheels of Cycle:");
		         int numberOfWheels = key.nextInt();
		         
		          System.out.println("Enter Weight of Cycle :");
		          int weight = key.nextInt();
		         
		          Cycle C1 = new Cycle(numberOfWheels,weight);
		        C1.print();
		    }
		 
		    }

