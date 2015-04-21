package payCalc;

public class driver {
	public  static void main(String [] args){
		
		  HazPay hp = new HazPay();
		     PayCalc myCalc = hp;
		    
		        double a=myCalc.computePay(13);
			 System.out.println("the hazard pay  is "+a);
		}
}
