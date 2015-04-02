package electronicEquipment;

public class electronics {
public String nameOfelectronics;
public double weight;
public double cost;
public double powerUsage;
public String nameOfManufacturer;
public electronics(String elecName,double weight,double cost,double usage,String manName){
	this.nameOfelectronics =elecName;
	this.weight=weight;
	this.cost=cost;
	this.powerUsage=usage;
	this.nameOfManufacturer=manName;
}
public void displaymessage(){
	System.out.println("Name of electronics is:"+nameOfelectronics
			+".\n Weight:"+weight+".\n Cost:"+cost+".\n Power Usage:"+powerUsage+".\nManufacturer:"
+nameOfManufacturer+".");
	
}
}
