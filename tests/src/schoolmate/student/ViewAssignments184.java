package schoolmate.student;

import org.junit.Before;
import org.junit.Test;

import schoolmate.Student;

public class ViewAssignments184 extends Student{
	@Before
	public void init() {		
		tester.setWorkingForm("student");
		addSubmitButton("//form[@name='student']");
	}

	@Test
	public void testPage() {
		this.genericTestPage("4", "2", "View Assignments");
	}
	
	@Test
	public void testPage2(){
		this.genericTestPage2("2", "View Assignments");
	}
	
	@Test
	public void testSelectclass() {
		tester.setTextField("page2", "2");
		tester.setTextField("selectclass", "1 -- '><a href=\"http://unitn.it\">XSS on selectclass</a><br'");
		
		tester.submit();
		
		tester.assertLinkNotPresentWithText("XSS on selectclass");
	}
	
	@Test
	public void testOnpage() {
		tester.clickLinkWithText("Assignments");
		tester.assertMatch("View Assignments");
		
		tester.setWorkingForm("assignments");
		addSubmitButton("//form[@name='assignments']");
		tester.setTextField("page2", "2");
		
		tester.setTextField("onpage", "1 '> <a href=\"www.unitn.it\">XSS on onpage</a> <br '");
		
		tester.submit();
		
		tester.assertMatch("View Assignments");
		tester.assertLinkNotPresentWithText("XSS on onpage");
	}
}
