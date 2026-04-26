package tests;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.MouseButton;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest2 extends BaseTest {

	@Test
	public void loginTest1() {
		LoginPage loginPage = new LoginPage(page);
		HomePage homePage = new HomePage(page);

		test.info("Navigating to login page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		test.info("Adding username");
		loginPage.addUserName("Admin");

		test.info("Adding password");
		loginPage.addPassword("admin123");

		test.info("Clicking login button");
		loginPage.clickLoginButton();

		test.info("Checking homepage");
		homePage.clickTimeLink();

		test.info("All steps completed");

	}

	@Test
	public void loginTest2() {

		test.skip("Skipping this test");
		throw new SkipException("Skipping this test");

	}

}
