package readingMaterials;

public class TestProgram {
	public static void main(String[] args){
	   ReadingMaterials a1, a2, a3, a4,a5;
//String name, String author, int n,String title,int year
	    a1 = new Books(" book", " Walter",200," book of life",2012);
	    //public Magazines(String name, String author, int n,String brand,int year) {
	    
	  a2 = new Magazines(" Magazine", "Sazerac", 50, "Bourbon",2015);
	    //public Novels(String name, String author, int n,String title,int year) {
	   a3 = new Novels("Novel","Shakespeare",1000,"Hamlet",1600);
	   // (String name, String author, int n,String title,int year,String course) {
       a4= new TextBooks("Textbook","Freedman",600,"university Java",2015,"computer");
	    
	 a1.displayMessage();
	 a2.displayMessage();
	 a3.displayMessage();
	 a4.displayMessage();
	 
	  }
}
