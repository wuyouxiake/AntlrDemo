
public class CourseEnrollment {
	private String courseTitle;
	private int credit;
	private String grade;
	private int qualityPoint;

//	Course title
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	
//credit
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
//grade	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
//quality point	
	public int getQualityPoint() {
		return qualityPoint;
	}
	public void setQualityPoint() {
		if(this.grade.equalsIgnoreCase("A")){
			this.qualityPoint = 4;
		}else if(this.grade.equalsIgnoreCase("B")){
			this.qualityPoint = 3;
		}else if(this.grade.equalsIgnoreCase("C")){
			this.qualityPoint = 2;
		}else if(this.grade.equalsIgnoreCase("D")){
			this.qualityPoint = 1;
		}
	}
}
