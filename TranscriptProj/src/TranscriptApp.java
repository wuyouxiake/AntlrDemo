import java.util.Scanner;
public class TranscriptApp {
	public static void main(String[] args){
		Transcript myTranscript=new Transcript();
		Scanner in=new Scanner(System.in);
		System.out.println("Welcome to the transcript application.");
		String ctn = "y";
		while(ctn.equalsIgnoreCase("y")){
			String title = Validator.getString(in, "Enter course: ");
			int credit = Validator.getInt(in, "Enter credit: ", 0, 5);
			String grade = Validator.getString(in, "Enter grade(A, B, C or D): ");
			CourseEnrollment myCourse = new CourseEnrollment();
			myCourse.setCourseTitle(title);;
			myCourse.setCredit(credit);	
			myCourse.setGrade(grade);
			myCourse.setQualityPoint();
			myTranscript.addCourseEnrollment(myCourse);
			System.out.println("Continue?(y/n)");
			ctn=in.next();
		}
		System.out.println("Course"+"		"+"Credits"+"	"+"Grade"+"	"+"Quality Points");
		System.out.println("------"+"		"+"-------"+"	"+"-----"+"	"+"--------------");
		myTranscript.Print();
		
	}
}
