package session43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
TC2
----

1)Login --->@BeforeClass
2)Search ---> @Test
3)Adv search --->@Test
4)Logout--->@AfterClass
*/
public class AnnotationDemo2 {

	@BeforeClass
	void login() {
		System.out.println("this is login ..");
	}
	@Test
	void search() {
		System.out.println("this is search ..");
	}

	@Test
	void advancesearch() {
		System.out.println("this is advance search ..");
	}

	@AfterClass
	void logout() {
		System.out.println("this is logout ..");
	}

}
