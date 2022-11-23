package methods;

import org.testng.annotations.Test;


public class program1 {
  @Test(priority=1)
  public void openingbrowser(){
	  System.out.println("ALLPICATION SUCCESSFULL OPENED");
	 }
  @Test(priority=5)
  public void customerdetails() {
	  System.out.println("CUSTOMER DETAILS UPDATED");
	 }
  @Test(priority=3)

  public void productdetails() {
	  System.out.println("PRODUCT IS UPDATED");
	 }
  @Test(priority=4)

  public void paymentdetails() {
	  System.out.println("PAYMENT DETAILS ARE UPDATED");
	 }
  @Test(priority=2)

  public void delivery() {
	  System.out.println("ORDER IS DELEVERD");
	 }
  @Test(priority=1)

  public void feedback() {
	  System.out.println("FEEDBACK UPDATED");
	 }
  
}


