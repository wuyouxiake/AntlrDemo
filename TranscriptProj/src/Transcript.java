import java.util.ArrayList;


public class Transcript {
	private ArrayList<CourseEnrollment> courseEnrollmentList = new ArrayList<>();
	static private double gpa=0;
	
	public void addCourseEnrollment(CourseEnrollment courseEnrollment) {
		courseEnrollmentList.add(courseEnrollment);
	}

	// Total
	public void setGpa(int gpaTotal, int listLength) {
		this.gpa = (double)gpaTotal/listLength;
	}

	public double getGpa() {
		return gpa;
	}
	
	public void Print(){
		int listLength=courseEnrollmentList.size();
		int gpaTotal=0;
		for(int i=0;i<listLength;i++){
			gpaTotal+=courseEnrollmentList.get(i).getQualityPoint();
		}
		for(int i=0;i<listLength;i++){
			System.out.println(courseEnrollmentList.get(i).getCourseTitle()
					+"	"+courseEnrollmentList.get(i).getCredit()+"	"
					+courseEnrollmentList.get(i).getGrade()+"	"
					+courseEnrollmentList.get(i).getQualityPoint());
		}
		gpa=(double)gpaTotal/listLength;
		System.out.println("					"+"GPA: "+gpa);
	}
}
