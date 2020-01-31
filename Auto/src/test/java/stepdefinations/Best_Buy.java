package stepdefinations;

import com.ElementWrapper;
import com.Object_Repo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utility.Hook;

public class Best_Buy {

	Object_Repo obj = new Object_Repo();

	ElementWrapper dr = new ElementWrapper();
	WebDriver driver = dr.driver;

	public Best_Buy() {
		this.driver = Hook.getDriver();
	}

	WebDriverWait wait = new WebDriverWait(driver,60);




	@Given("^I open a browser$")
	public void i_open_a_browser() throws Throwable {
		driver.get(obj.URL);
		System.out.println("Browser is opened successfully");
		Hook.takeSnapShot(driver, "Screenshot//Country_Options.png") ;
		Thread.sleep(1000);
	}

	@When("^User chooses to country Options$")
	public void User_chooses_to_country_Options() throws Throwable {

		WebElement Notification_Popup = dr.returnWebElement(obj.notification_Popup, "xpath");
		Notification_Popup.click();
		String parentHandle = driver.getWindowHandle(); // get the current window handle
		System.out.println("++++++++++++ß++"+parentHandle);
		Thread.sleep(500);
		WebElement close = dr.returnWebElement("/html/body/div[6]/div/div/div[1]/button/span[1]", "xpath");
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", close);

		Thread.sleep(500);

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		}
		Thread.sleep(2000);
	}
	@Then("^User search for a product$")
	public void User_search_for_a_product() throws Throwable {
		WebElement Search_text = dr.returnWebElement(obj.Search_Text, "xpath");
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", Search_text);
		//Search_text.click();
		Search_text.sendKeys("Bose® - Frames Alto Large Audio Sunglasses with Bluetooth Connectivity - Black");
		Search_text.sendKeys(Keys.ENTER);
		Thread.sleep(1000);

	}
	@Then("^User add the product to ADD Cart$")
	public void User_add_the_product_to_ADD_Cart() throws Throwable {
		WebElement add_cartbutton = dr.returnWebElement(obj.AddCart_Button, "xpath");
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", add_cartbutton);
		System.out.println("++++++++++++++1111111"+add_cartbutton);
		WebElement alert_Addcart = dr.returnWebElement(obj.Alert_ADDCart, "cssselector");
		alert_Addcart.click();
		Hook.takeSnapShot(driver, "Screenshot//ADD_Cart.png") ;
		Thread.sleep(1000);

	}
	@Then("^Verify the product in ADD Cart$")
	public void Verify_the_product_in_ADD_Cart() throws Throwable {

	}
	@Then("^User click Checkout Button$")
	public void User_click_Checkout_Button() throws Throwable {
		//click checkout button
		WebElement checkout_btn = dr.returnWebElement(obj.Checkout_Btn, "xpath");
		checkout_btn.click();

	}
	@Then("^User login as Guest$")
	public void User_login_as_Guest() throws Throwable {
		wait.until(webDriver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete"));
		//click guest link
		WebElement guest_link = dr.returnWebElement(obj.Guest_link, "xpath");
		guest_link.click();

	}
	@Then("^User enter contact information$")
	public void User_enter_contact_information() throws Throwable {
		wait.until(webDriver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete"));
		//email address
		WebElement email_id = dr.returnWebElement(obj.Email_ID, "id");
		email_id.sendKeys("Sin23423gapore@gamil.com");
		//enter phone
		WebElement phoneNum = dr.returnWebElement(obj.Phone_Num, "id");
		phoneNum.sendKeys("345 678 95673");
		Hook.takeSnapShot(driver, "Screenshot//contact_information.png") ;
		Thread.sleep(1000);

		WebElement Continue_Payment_btn = dr.returnWebElement(obj.Payment_Info, "xpath");
		Continue_Payment_btn.click();

	}
	@Then("^User enter the Payment details and card number$")
	public void User_enter_the_Payment_details_and_card_number() throws Throwable {
		//enter card
		WebElement card_Num = dr.returnWebElement(obj.Card_Number, "xpath");
		card_Num.sendKeys("1234567890987654");

		//enter first name
		WebElement first_name = dr.returnWebElement(obj.First_Name, "id");
		first_name.sendKeys("ranjith");


		//enter last name
		WebElement last_name = dr.returnWebElement(obj.Last_Name, "id");
		last_name.sendKeys("kumar");


		//enter address
		WebElement address = dr.returnWebElement(obj.Street_Address, "id");
		address.sendKeys("123 67th St area");


		//enter city
		WebElement city = dr.returnWebElement(obj.City, "id");
		city.sendKeys("Valley");


		//select state
		WebElement state = dr.returnWebElement(obj.State, "xpath");
		Select select = new Select(driver.findElement(By.xpath(obj.State)));
		select.selectByVisibleText("AL");

		//enter zipcode
		WebElement zipcode = dr.returnWebElement(obj.Zipcode, "id");
		zipcode.sendKeys("456783");

		Hook.takeSnapShot(driver, "Screenshot//Payment_details_and_card_number.png") ;
		Thread.sleep(1000);

		WebElement place_Order = dr.returnWebElement(obj.Plece_Order, "xpath");
		place_Order.click();


	}
	@Then("^verify the Success Message$")
	public void verify_the_Success_Message() throws Throwable {
		WebElement Error_Msg = dr.returnWebElement(obj.Error_Message, "xpath");
		String Actual_Message = Error_Msg.getText();
		Assert.assertEquals(Actual_Message, "Please enter a valid card number.");
		Hook.takeSnapShot(driver, "Screenshot//Error.png") ;
		Thread.sleep(5000);

	}


}
