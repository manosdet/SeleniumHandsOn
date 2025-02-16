package session43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {

	
	@BeforeSuite
	void bs() {
		System.out.println("this before Suite ..");
	}
	@AfterSuite
	void as() {
		System.out.println("this is After suite..");
	}
	@BeforeTest
	void bt() {
		System.out.println("this is before test ..");
	}
	@AfterTest
	void at() {
		System.out.println("this isAfter test ..");
	}
	@Test(priority = 1)
	void test1() {
		System.out.println("this is Test1..");
	}
	@Test(priority = 2)
	void test2() {
		System.out.println("this is Test2..");
	}
	@BeforeClass
	void bc() {
		System.out.println("this is before class ..");
	}
	@AfterClass
	void ac() {
		System.out.println("this is After Class ..");
	}
	@BeforeMethod
	void bm() {
		System.out.println("this is before method ..");
	}
	@AfterMethod
	void am() {
		System.out.println("this is after method ..");
	}

}
