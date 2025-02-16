package session42;

import org.testng.annotations.Test;

/*
 * 1)Open app
 * 2)Login
 * 3)Logout
 */
public class FirstTestCase {
    @Test(priority=1)
	void openapp() {
		System.out.println("open app test");
	}
    @Test(priority=0)
	void login() {
		System.out.println("login app test");

	}
	@Test(priority=-1)
	void logout() {
		System.out.println("logout app test");

	}
}
