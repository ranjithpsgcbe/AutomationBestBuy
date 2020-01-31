package com;

public class Object_Repo {
    public String notification_Popup = "/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/h4";
    public String Search_Text = "//input[@id='gh-search-input']";
    public String AddCart_Button = "(//button[@type='button'])[14]";
    public String Alert_ADDCart = ".cart-nav-text";
    //public String Radio_btn_Shipping = "//input[contains(@id,'availability-radio-1')]";
    public String Checkout_Btn = "//button[contains(.,'Checkout')]";
    public String Guest_link = "//a[contains(.,'Continue as Guest')]";
    public String First_Name = "payment.billingAddress.firstName";
    public String Last_Name = "payment.billingAddress.lastName";
    public String Street_Address = "payment.billingAddress.street";
    public String City = "payment.billingAddress.city";
    public String State = "//*[@id='payment.billingAddress.state']";
    public String Zipcode = "payment.billingAddress.zipcode";
    public String Email_ID = "user.emailAddress";
    public String Phone_Num = "user.phone";
    public String Card_Number = "//*[@id='optimized-cc-card-number']";
    public String Plece_Order = "//button[contains(.,'Place Your Order')]";
    public String Payment_Info = "//button[contains(.,'Continue to Payment Information')]";
    public String Error_Message = "//span[@id=\"card-number\"]";

    public String Expected_Message = "Please enter a valid credit card number.";


    public static String PATH_FIREFOX_DRIVER = "./geckodriver.exe";
    public static String PATH_CHROME_DRIVER = "('user.dir')"+"/drivers/chromedriver1";
    public static String PATH_EDGE_DRIVER = "./MicrosoftWebDriver.exe";

    public static String URL = "https://www.bestbuy.com/";
}
