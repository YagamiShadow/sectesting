package schoolmate.teacher;

import org.junit.Before;
import org.junit.Test;

import schoolmate.Teacher;

public class ViewStudents181 extends Teacher{	
	@Before
	public void init() {
		tester.setWorkingForm("teacher");
		addSubmitButton("//form[@name='teacher']");
	}
	
	@Test
	public void testPage() {
		this.genericTestPage("2", "8", "Students");
	}
	
	@Test
	public void testPage2(){
		this.genericTestPage2("8", "Students");
	}
	
	@Test
	public void testSelectclass() {
		this.genericTestSelectclass("1", "8", "Students");
	}
}

