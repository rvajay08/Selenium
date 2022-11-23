package stepDefinition;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class use {


	WebDriver d;
	@Given("opening the newtours url")
	public void opening_the_newtours_url() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new ChromeDriver();
		
	   
	}

	@When("opening the registration form")
	public void opening_the_registration_form() throws InterruptedException {
		d.get("https://demo.guru99.com/test/newtours/register.php");
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		
	   
	}

	@Then("by giving the required details")
	public void by_giving_the_required_details() throws InterruptedException {
		d.findElement(By.name("firstName")).sendKeys("reddy");
		d.findElement(By.name("lastName")).sendKeys("ajay");
		d.findElement(By.name("phone")).sendKeys("8106045810");
		d.findElement(By.id("userName")).sendKeys("rvajay33@gmaiil.com");
		d.findElement(By.name("country")).sendKeys("INDIA");
		Thread.sleep(5000);
		
	    
	}

	@And("close the application of url")
	public void close_the_application_of_url() {
		d.close();
	    
	}


}

