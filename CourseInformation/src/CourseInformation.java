import java.util.Scanner;

public class CourseInformation {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		String courseNumber;
		String courseNum2;
		String courseTitle;
		String courseTitle2;
		String instructior;
		String term;
		String classTime;

		
		courseNumber = scnr.nextLine().toString();
		courseTitle = scnr.nextLine().toString();
		courseNum2 = scnr.nextLine().toString();
		courseTitle2 = scnr.nextLine().toString();
		instructior = scnr.nextLine().toString();
		term = scnr.nextLine().toString();
		classTime = scnr.nextLine().toString();
		
//		System.out.println();
			
		// My code:
		Course myCourse = new Course ();
//		myCourse.Course(courseNumber, courseTitle);
		myCourse.setCourseNumber(courseNumber);
		myCourse.setCourseTitle(courseTitle);
//		myCourse.getcoursetNumber();
		myCourse.printInfo();
		
//		OfferedCourse myOfferedCourse = new OfferedCourse(courseNum2,courseTitle2,instructior,
//															term,classTime);
		OfferedCourse myOfferedCourse = new OfferedCourse();
//		myOfferedCourse.Course(courseNum2, courseTitle2);
//		myOfferedCourse.OfferedCourse(instructior,term,classTime);
		myOfferedCourse.setCourseNumber(courseNum2);
		myOfferedCourse.setCourseTitle(courseTitle2);
		myOfferedCourse.setInstructorName(instructior);
		myOfferedCourse.setTerm(term);
		myOfferedCourse.setClassTime(classTime);

		myOfferedCourse.printInfo();


	
//		System.out.println("Course Information: ");
//		System.out.println("   Course Number: " + myOfferedCourse.getcourseNum() );
//		System.out.println("   Course Title: " + myOfferedCourse.getcourseTitle() );
//		System.out.println("   Instructor Name: " + myOfferedCourse.getinstructior() );
//		System.out.println("   Term: " + myOfferedCourse.getterm() );
//		System.out.println("   Class Time: " + myOfferedCourse.getclassTime());
	}


}
		
		


	
