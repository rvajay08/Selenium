package stepDefinition;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class deslern {
	WebDriver d;
	@Given("user is in dezlearn title")
	public void user_is_in_dezlearn_title() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.dezlearn.com/javascript-alerts/");
		d.manage().window().maximize();
	    
	}

	@When("user url and title")
	public void user_url_and_title() {
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
		
	    
	}

	@Then("user works on alert")
	public void user_works_on_alert() {
		d.findElement(By.id("s_alert1")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	    
	}

	@And("get screenshot and close the window")
	public void get_screenshot_and_close_the_window() throws IOException, InterruptedException {
		File img=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		com.google.common.io.Files.copy(img,new File("C:\\Users\\Reddy\\Pictures"));
		
		d.close();
	    
	}


}
