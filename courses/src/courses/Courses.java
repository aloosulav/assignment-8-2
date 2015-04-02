package courses;

public class Courses {
	//the title, number, description, and department 
	public String courseName;
	public int section;
	public String memo;
	public String department;
	public Courses(String name,int sec,String description,String dept){
		this.courseName=name;
		this.section=sec;
		this.memo=description;
		this.department=dept;
		
	}
	public void displaymessage(){
		System.out.println("Course name:"+courseName+".\nCourse section:"+section+".\nCourse memo:"+memo+".\nDepartment:"+department);
			}
	
}
