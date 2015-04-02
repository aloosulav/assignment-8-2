package courses;



public class TestCourses {
	public static void main(String[] args){
		  Courses a1, a2, a3, a4;
	
		a1= new computer("CSC", 201, "This class will focus on programming with java", "Engineering");
		a2=new art("ART",101,"This class will teach about  arts from ancient age till now", "Humanities and Art");
		a3=new egr("EGR",240,"This course will cover forces on static and dynamic objects","Engineering");
		a4=new physics("PHY",231,"This course will cover statics and dynamic objects, electricity, magnetism","Science");
		    
		 a1.displaymessage();
		 a2.displaymessage();
		 a3.displaymessage();
		 a4.displaymessage();
		 
		  }
}
