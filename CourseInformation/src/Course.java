import java.util.Scanner;
public class Course {
	protected String courseNum;
	protected String courseTitle;
	

//	public void Course(String courseNum, String courseTitle) {
//		this.courseNum = courseNum;
//		this.courseTitle = courseTitle;
//		
//	}
	
	public void setCourseNumber(String courseNum) {
		this.courseNum = courseNum;

	}
	
	public String getCourseNumber() {

		return courseNum;
	}
	
	public void setCourseTitle(String courseTitle) {
		
		this.courseTitle = courseTitle;
	
	}
	
	public String getCourseTitle() {

		return courseTitle;
	}
	
	public void printInfo() {
		
		
		System.out.println("Course Information: ");
		System.out.println("   Course Number: " + courseNum );
		System.out.println("   Course Title: " + courseTitle );
		
	}

}
