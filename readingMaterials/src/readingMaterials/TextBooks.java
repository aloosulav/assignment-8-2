package readingMaterials;

public class TextBooks extends ReadingMaterials{
	public int yearPublished;
	public String titleName;
	public String courseName;

		public TextBooks(String name, String author, int n,String title,int year,String course) {
			super(name, author, n);
			// TODO Auto-generated constructor stub
			this.yearPublished=year;
			this.titleName=title;
			this.courseName=course;
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
		public String getCourse() {
		return courseName;
	}
	public void setCourse(String course) {
		this.courseName = course;
	}
	public void displayMessage(){
		super.displayMessage();
		System.out.println("the title of the textbook is"+titleName+".\n the textbook was published in "+yearPublished+".\n the textbook is for the "
			+courseName+" course\n-------------------------------------------------");
	}
	}

