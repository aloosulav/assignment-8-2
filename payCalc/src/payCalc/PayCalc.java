package payCalc;


public abstract class PayCalc {
	
		public double payRate=12;
		public double hours=5;
		public double finalPay;
		public double computePay(double hours){
			finalPay=payRate*hours;
				return finalPay;
			}
	
		}


