package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class sce1{
	WebDriver d;
	

@Given("opening the amazon url")
public void opening_the_amazon_url() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	d=new ChromeDriver();
	d.get("https://www.amazon.in/");
	d.manage().window().maximize();
	Thread.sleep(2000);
    }

@When("capturing the links")
public void capturing_the_links() {
	WebElement links =d.findElement(By.xpath("//*[@id=\"nav-main\"]"));
	List<WebElement>a=links.findElements(By.tagName("a"));
	System.out.println(a.size());
	for(int i=0;i<=a.size();i++) {
		a.get(i).click();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.navigate().back();
		links =d.findElement(By.xpath("//*[@id=\"nav-main\"]"));
		a=links.findElements(By.tagName("a"));
	
		
		
	}
	
    }

@Then("screenshot")
public void screenshot() {
}
@And("close the url")
public void close_the_url() {
    }}


