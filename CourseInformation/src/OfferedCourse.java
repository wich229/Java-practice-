
public class OfferedCourse extends Course {
	
	private String instructior;
	public String term;
	public String classTime;
	
//	protected void OfferedCourse(String instructior, String term, String classTime) {
//		
//		this.instructior = instructior;
//		this.term = term;
//		this.classTime = classTime;
//		
//	}
	
	public void setInstructorName(String instructior) {
		this.instructior = instructior;
	}
	
	public String getInstructorName(){

		return instructior;
	}
	
	public void setTerm(String term) {
		this.term = term;

	}
	
	public String getTerm() {
		
		return term;
	}
	
	public void setClassTime(String classTime) {
		
		this.classTime = classTime;
		
	}
	
	public String getClassTime() {

		return classTime;
	}
	
//	public void printAllInfo(String courseNum, String courseTitle, String instructior, String term, String classTime ) {
	public void printInfo() {
		
		super.printInfo();
		
		System.out.println("   Instructor Name: " + instructior);
		System.out.println("   Term: " + term );
		System.out.println("   Class Time: " + classTime );
		
	}
}
