package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Hook;

import java.util.concurrent.TimeUnit;




public class ElementWrapper {

    private static final TimeUnit SECONDS = null;
    public static WebDriver driver;

    Object_Repo obj = new Object_Repo();

    public ElementWrapper() {
        this.driver = Hook.getDriver();
    }


    public WebElement returnWebElement(String webElement, String type)
    {
        WebDriverWait wait = new WebDriverWait(driver, 90);
        int tryCount = 1;
        while (tryCount <= 2)
        {
            try
            {
                if (type.equalsIgnoreCase("linktext"))
                {
                    return	wait.until(ExpectedConditions.elementToBeClickable(By.linkText(webElement)));
                }
                else if (type.equalsIgnoreCase("xpath"))
                {
                    return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(webElement)));

                }
                else if (type.equalsIgnoreCase("name"))
                {
                    return wait.until(ExpectedConditions.elementToBeClickable(By.name(webElement)));

                }
                else if (type.equalsIgnoreCase("id"))
                {
                    return wait.until(ExpectedConditions.elementToBeClickable(By.id(webElement)));

                }
                else if (type.equalsIgnoreCase("classname"))
                {
                    return wait.until(ExpectedConditions.elementToBeClickable(By.className(webElement)));

                }
                else if (type.equalsIgnoreCase("cssselector"))
                {
                    return wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(webElement)));

                }
                else if (type.equalsIgnoreCase("partialLinkText"))
                {
                    return wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(webElement)));

                }
            }

            catch(Exception e)
            {

                if (type.equalsIgnoreCase("linktext")){
                    return	wait.until(ExpectedConditions.elementToBeClickable(By.linkText(webElement)));
                }
                else if (type.equalsIgnoreCase("xpath")){
                    return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(webElement)));

                }
                else if (type.equalsIgnoreCase("name")){
                    return wait.until(ExpectedConditions.elementToBeClickable(By.name(webElement)));

                }
                else if (type.equalsIgnoreCase("id")){
                    return wait.until(ExpectedConditions.elementToBeClickable(By.id(webElement)));


                }
                else if (type.equalsIgnoreCase("classname")){
                    return wait.until(ExpectedConditions.elementToBeClickable(By.className(webElement)));

                }
                else if (type.equalsIgnoreCase("cssselector")){
                    return wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(webElement)));

                }
                else if (type.equalsIgnoreCase("partialLinkText")){
                    return wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(webElement)));

                }
            }
        }
        return null;
    }
}
