package readingMaterials;

public class ReadingMaterials {
public String nameofMaterial;
public String authorOfMaterial;
public int numOfpages;
public ReadingMaterials(String name,String author,int n){
	nameofMaterial=name;
	authorOfMaterial=author;
	numOfpages=n;
}
public void displayMessage(){
	 System.out.println("Reading material is a" + nameofMaterial);
	 System.out.println("The author of " + nameofMaterial+" is "+ authorOfMaterial);
	 System.out.println("The total number of pages in "+nameofMaterial+" is "+numOfpages);
	 }
}
