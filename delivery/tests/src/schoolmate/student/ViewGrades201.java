package schoolmate.student;

import org.junit.Before;
import org.junit.Test;

import schoolmate.Student;

public class ViewGrades201 extends Student{	
	@Before
	public void init() {
		tester.setWorkingForm("student");
		addSubmitButton("//form[@name='student']");
	}
	
	@Test
	public void testPage() {
		this.genericTestPage("4", "3", "Grades");
	}
	
	@Test
	public void testPage2(){
		this.genericTestPage2("3", "Grades");
	}
	
	@Test
	public void testSelectclass() {
		this.genericTestSelectclass("1", "3", "Grades");
	}
}

