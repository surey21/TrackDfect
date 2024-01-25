package org.step;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinition {
 
	  WebDriver driver;
@Given("Launch The Fipkart URL and Do a Product Serach")
public void launch_The_Fipkart_URL_and_Do_a_Product_Serach() {
	WebDriverManager.chromedriver().setup();

     driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
}

@When("Select Apple Iphone {int}pro max and Add that to the card")
public void select_Apple_Iphone_pro_max_and_Add_that_to_the_card(Integer int1) throws AWTException {
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	search.sendKeys("apple 15 pro max");
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	driver.findElement(By.xpath("//div[text()='Apple iPhone 15 Pro Max (Blue Titanium, 256 GB)']")).click();
	
	Set<String> windows = driver.getWindowHandles();
	List<String> l= new LinkedList();
	l.addAll(windows);
	String SecWindow = l.get(1);
	driver.switchTo().window(SecWindow);
	
	driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
	
}

@When("Place Order and Login to the Application")
public void place_Order_and_Login_to_the_Application() throws InterruptedException {
driver.findElement(By.xpath("//span[text()='Place Order']")).click();
	// We Cannot Automate the Login ---why means it is through Captcha 


//	WebElement phNum = driver.findElement(By.xpath("//input[@class='_2IX_2- _17N0em']"));
//	phNum.sendKeys("7502532275");
//	
//	driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
//	Thread.sleep(60000);
//	WebElement OTP = driver.findElement(By.xpath("//input[@class='_2IX_2- _3umUoc _3mctLh _17N0em']"));
//	OTP.sendKeys("391947");
	
//	WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
//	login.click();
//	
}


@When("select Adress Details and Payment Option")
public void select_Adress_Details_and_Payment_Option() {
//	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Suresh");
//	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9092121609");
//	driver.findElement(By.xpath("//input[@name='pincode']")).sendKeys("600100");
//	driver.findElement(By.xpath("//input[@name='addressLine2']")).sendKeys("Pallikaranai");
//	WebElement adress = driver.findElement(By.xpath("//*[@name='addressLine1']"));
//	adress.sendKeys("Muvendar street,Pallikarani");
//	
//	driver.findElement(By.xpath("//span[text()='Home (All day delivery)']")).click();
//	driver.findElement(By.xpath("//button[text()='Save and Deliver Here']")).click();
//	driver.findElement(By.xpath("//button[text()='CONTINUE']")).click();
//	Thread.sleep(4000);
//	driver.findElement(By.xpath("//button[text()='Accept & Continue']")).click();
}

@Then("Remove tha product from the card")
public void remove_tha_product_from_the_card() {


}


	
	
	
	
	
	
	
	
}
