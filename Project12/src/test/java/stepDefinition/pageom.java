package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class pageom {
	WebDriver d;
	@Given("opening amazon site")
	public void opening_amazon_site() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_nxqtetlae_e&adgrpid=60571832564&hvpone=&hvptwo=&hvadid=486387378181&hvpos=&hvnetw=g&hvrand=3430925646385504039&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302457&hvtargid=kwd-296458789801&hydadcr=14452_2154371&gclid=CjwKCAiA68ebBhB-EiwALVC-NiNQYcO2bunGmBxOTbyB3tnGf_W_zfqrtbi3zABzs75tYk-SOqjZFxoCjasQAvD_BwE");
	    d.manage().window().maximize();
	}

	@When("getting the title and current url")
	public void getting_the_title_and_current_url() {
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
	   
	}

	@Then("sign into tha amazon by giving username and password")
	public void sign_into_tha_amazon_by_giving_username_and_password() throws InterruptedException {
		d.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span")).click();
		d.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[30]/a")).click();
		d.findElement(By.id("ap_email")).sendKeys("rvajay33@gmail.com");
		d.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		d.findElement(By.id("ap_password")).sendKeys("18731a0533");;
;	    
	}

	@And("back to home page")
	public void back_to_home_page() {
		d.close();
	  
	}
	
	}




