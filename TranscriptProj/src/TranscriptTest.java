import org.junit.*;
import static org.junit.Assert.*;

public class TranscriptTest {

	@Test
	public void test_GetQualityPoint() {
		System.out.println("Test if the system returns a correct Quanlity Point...");
		CourseEnrollment myCourse = new CourseEnrollment();
		myCourse.setGrade("A");
		myCourse.setQualityPoint();
		assertTrue(myCourse.getQualityPoint() == 4);
	}
	
	@Test
	public void testGpa(){
		System.out.println("Test if the system returns a correct GPA...");
		Transcript t=new Transcript();
		t.setGpa(9,3);
		assertTrue(t.getGpa() ==3);
	}
	@Test
	public void testSetCourseTitle(){
		System.out.println("Test if the system give the wanted value to the course title...");
		CourseEnrollment myCourse = new CourseEnrollment();
		myCourse.setCourseTitle("java");
		assertTrue(myCourse.getCourseTitle().equalsIgnoreCase("java"));
	}
	@Test
	public void testSetCredit(){
		System.out.println("Test if the system give the wanted value to the course credit...");
		CourseEnrollment myCourse = new CourseEnrollment();
		myCourse.setCredit(3);
		assertTrue(myCourse.getCredit()==3);
	}
	@Test
	public void testSetGrade(){
		System.out.println("Test if the system give the wanted value to the course grade...");
		CourseEnrollment myCourse = new CourseEnrollment();
		myCourse.setGrade("A");
		assertTrue(myCourse.getGrade().equalsIgnoreCase("A"));
	}
}