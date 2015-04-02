package readingMaterials;

public class Books extends ReadingMaterials {
public int yearPublished;
public String titleName;
	public Books(String name, String author, int n,String title,int year) {
		super(name, author, n);
		// TODO Auto-generated constructor stub
		this.yearPublished=year;
		this.titleName=title;
	}
	public void setYear(int year){
		yearPublished=year;
	}
	public int getYear(){
		return yearPublished;
	}
	public void setTitle(String title){
		titleName=title;
	}
	public String getTitle(){
		return titleName;
	}
public void displayMessage(){
	super.displayMessage();
	System.out.println("the title of the book is"+titleName+".\n the book was published in "+yearPublished+"\n-------------------------------------------------");
}
}
