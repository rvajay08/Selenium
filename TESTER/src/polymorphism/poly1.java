// sample example
 package polymorphism;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//
//public class poly1 {
//	public void add() {
//		System.out.println("null parameters");
//	}
//	public void add(int a,int b){
//		int c=a+b;
//		System.out.println(c);
//	}
//	public void add(double c,double d) {
//		double e=c+d;
//		System.out.println(e);
//	}
//	public void add(String f,String g) {
//		String h=f+g;
//		System.out.println(h);
//	}
//
//	public static void main(String[] args) {
//		poly1 a1=new poly1();
//		a1.add();
//		a1.add(12, 120);
//		a1.add(241.09, 7263.000);
//		a1.add("ajay","sruthi");
//		// TODO Auto-generated method stub
//
//	}
//
//
 
 public class poly1 {
	 WebDriver d;
	public void login() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();
		System.out.println("nullm parameters");
	}
	public void login(String a,String b) {
//		String c=a+b;
//		System.out.println(c);
		d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(a);
	    d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(b);
	    
	}
		
	
		public static void main(String[] args) {
			poly1 aj=new poly1();
			aj.login();
			aj.login("ajay", "null");
	}
		}


