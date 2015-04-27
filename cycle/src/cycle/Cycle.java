package cycle;

public class Cycle {
	
	    private int numberOfWheels;
	    private int weight;
	    
	    Cycle(){
	        this(100,1000);
	    }
	    Cycle(int numberOfWheels,int weight){
	        this.numberOfWheels=numberOfWheels;
	        this.weight=weight;
	        try {
	            if(numberOfWheels<=0 || weight<=0) {
	                throw new Exception("Values cannot be less than or equal to zero");
	            }
	       } catch(Exception e) {
	            System.out.println(e);
	       }
	    }
	    public int getNumberOfWheels() {
        return numberOfWheels; 
            }
	    public int getWeight() { 
	    	return weight;
	    	}
	  
	    }
	 
	

