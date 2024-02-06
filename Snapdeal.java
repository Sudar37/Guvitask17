package Guvitask17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();

	        // Maximize the browser window
	        driver.manage().window().maximize();

	        // Navigate to Snapdeal website
	        driver.get("http://www.snapdeal.com/");

	        // Click on the Sign In button
	        WebElement signInButton = driver.findElement(By.xpath("//div[@class='accountUserName col-xs-12 reset-padding']//span[text()='Sign In']"));
	        signInButton.click();

	        // Enter valid Email Id
	        WebElement emailField = driver.findElement(By.id("userName"));
	        emailField.sendKeys("sudar2@email.com");

	        // Click on the Continue button
	        WebElement continueButton = driver.findElement(By.id("checkUser"));
	        continueButton.click();

	        // Enter valid password
	        WebElement passwordField = driver.findElement(By.id("j_password_login_uc"));
	        passwordField.sendKeys("Asdfg@1234");

	        // Click on the Login button
	        WebElement loginButton = driver.findElement(By.id("submitLoginUC"));
	        loginButton.click();

	        // Verify successful login
	        String pageTitle = driver.getTitle();
	        if (pageTitle.contains("Snapdeal")) {
	            System.out.println("User logged in successfully. Verification message: Snapdeal login successful!");
	        } else {
	            System.out.println("Login failed. Verification message: Snapdeal login unsuccessful.");
	        }

	        // Close the browser
	        driver.quit();
	}

}
