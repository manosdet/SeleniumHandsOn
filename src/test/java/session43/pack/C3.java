package session43.pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
	@Test
	void pqr() {
		System.out.println("this is pqr from c3 ..");
	}
	@BeforeSuite
	void bs() {
		System.out.println("this is bs from c3 ..");
	}
	
	@AfterSuite
	void as() {
		System.out.println("this is as from c3 ..");
	}
}
