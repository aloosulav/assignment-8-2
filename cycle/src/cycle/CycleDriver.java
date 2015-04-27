package cycle;

import java.io.File;


import java.util.Scanner;

public class CycleDriver  {
	
		    public static void main(String args[]) throws NullPointerException{
		    	 
		    		  
		    	Scanner inputFile=null;
		         String fileName= "Cycle.txt";
		         try{
		         inputFile= new Scanner(new File(fileName));
		    	}
		         catch(Exception e){
		        	 System.out.println("File not found");
		         }
		          //System.out.println("Enter Number of Wheels of Cycle:");
		     String[]name=new String[2];
		     int i=0;
		         while(inputFile.hasNextLine()){
		         name[i]=inputFile.nextLine();
		         i++;
		         }
		         inputFile.close();
		         for (String n:name){
		        	 System.out.println(n);
		         }
		         /*
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
		         */
		    }
		    }
		    
		    

