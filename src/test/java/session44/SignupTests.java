package session44;

import org.testng.annotations.Test;

public class SignupTests {
	  @Test(priority=1,groups= {"regression"})
		void signupbyEmail() {
			System.out.println("this is signup by email....");
		}
	    @Test(priority=2,groups= {"regression"})
	   	void signupbyFaceboo() {
	   		System.out.println("this is signup by facebook....");
	   	}
	    @Test(priority=3,groups= {"regression"})
	   	void signupbyTwitter() {
	   		System.out.println("this is signup by twitter....");
	   	}
	    
}
