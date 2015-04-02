package readingMaterials;

public class  Magazines extends ReadingMaterials {
	public int yearPublished;
	public String brandName;
		public Magazines(String name, String author, int n,String brand,int year) {
			super(name, author, n);
			// TODO Auto-generated constructor stub
			this.yearPublished=year;
			this.brandName=brand;
		}
		public void setYear(int year){
			yearPublished=year;
		}
		public int getYear(){
			return yearPublished;
		}
		public void setBrand(String brand){
			brandName=brand;
		}
		public String getBrand(){
			return brandName;
		}
	public void displayMessage(){
		super.displayMessage();
		System.out.println("the magazine publishs articles on "+brandName+".\n the magazine was published in "+yearPublished+"\n-------------------------------------------------");
	}
	}

