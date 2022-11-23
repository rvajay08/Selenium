package stepDefinition;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class properties {
	WebDriver d;
	
	@Given("user is in newtours page")
	public void user_is_in_newtours_page() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/login.php");
		d.manage().window().maximize();
	}

	@When("you needs to enter username and password")
	public void you_needs_to_enter_username_and_password() throws IOException, InterruptedException {
		FileInputStream f1=new FileInputStream("C:\\Users\\Reddy\\eclipse-workspace\\Project12\\src\\test\\java\\stepDefinition\\p5.properties");
		Properties p5=new Properties();
		p5.load(f1);
		d.findElement(By.name("userName")).sendKeys(p5.getProperty("username"));
		d.findElement(By.name("password")).sendKeys(p5.getProperty("password"));
		Thread.sleep(5000);
		
	    
	}

	@Then("click submit button")
	public void click_submit_button() {
		d.findElement(By.name("submit")).click();
	}

	@And("take screenshot and close the application")
	public void take_screenshot_and_close_the_application() throws IOException {
		File	a1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		   Files.copy(a1,new File("C:\\Users\\Reddy\\OneDrive\\Pictures\\Saved Pictures new2.png"));
		   d.close();
	    
	}

}
