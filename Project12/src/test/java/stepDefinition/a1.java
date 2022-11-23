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

public class a1 {
	WebDriver d;
	@Given("user is in amazon page")
	public void user_is_in_amazon_page() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%2F%3F_encoding%3DUTF8%26adgrpid%3D59527504272%26ext_vrnc%3Dhi%26gclid%3DCj0KCQiAgribBhDkARIsAASA5btgy71VFPHWCn5JZ4iknNrmHVpOo4q3Cl51Bc1y7ypFnspRBpN5i6UaAok4EALw_wcB%26hvadid%3D596980891918%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9302457%26hvnetw%3Dg%26hvpone%3D%26hvpos%3D%26hvptwo%3D%26hvqmt%3Db%26hvrand%3D7968931350695072672%26hvtargid%3Dkwd-365111317397%26hydadcr%3D19941_2255885%26ie%3DUTF8%26index%3Delectronics%26keywords%3Damazon%2520sign%26ref%3Dpd_sl_43b97jzn5c_b%26tag%3Dgooginhydr1-21%26ref_%3Dnav_em_hd_re_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&&ref_%3Dnav_em_hd_clc_signin_0_1_1_33");
		d.manage().window().maximize();
	    
	}

	@When("you needs to enter username and password")
	public void you_needs_to_enter_username_and_password() throws InterruptedException {
		d.findElement(By.name("email")).sendKeys("rvajay33@gmail.com");
		d.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		d.findElement(By.id("ap_password")).sendKeys("18731a0533");;
	
	    
	}

	@Then("click login button")
	public void click_login_button() {
		d.findElement(By.id("signInSubmit")).click();
	    
	}

	@And("close the application")
	public void close_the_application() {
		
	}
		
	    
	

	public static void main(String[]args) {
	}{
	

	}
}


