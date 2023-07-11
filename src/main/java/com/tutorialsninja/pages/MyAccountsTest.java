package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class MyAccountsTest extends Utility
{
    By myAccount = By.xpath("//span[contains(text(),'My Account')]");
    By register = By.xpath("//a[contains(text(),'Register')]");
    By textRegister = By.xpath("//div[@id='content']//h1");
    By login = By.xpath("//a[contains(text(),'Login')]");
    By text = By.xpath("//h2[contains(text(),'Returning Customer')]");
    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-lastname");
    By telephone = By.id("input-telephone");
    By password = By.id("input-password");
    By confirmPassword = By.id("input-confirm");
    By redioButton = By.xpath("//fieldset[3]//input");
    By privacy = By.xpath("//div[@class = 'buttons']//input[@name='agree']");
    By continueButton = By.xpath("//div[@class = 'buttons']//input[@value='Continue']");
    By message = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    By getContinueButton = By.xpath("//a[contains(text(),'Continue')]");
    By link  = By.xpath("//span[contains(text(),'My Account')]");

    By logOut = By.linkText("Logout");
    By text1 = By.xpath("//h1[contains(text(),'Account Logout')]");
    By getContinueButton1 = By.xpath("//a[contains(text(),'Continue')]");


    public void setMyAccount()
    {
        //3.1 Clickr on My Account Link.
        clickOnElement(myAccount);
    }
    public void setRegister()
    {
        //Call the method “selectMyAccountOptions” method and pass the parameter
        //“Register
        clickOnElement(register);
    }
    public void setTextRegister()
    {
        //1.3 Verify the text “Register Account”.
        getTextFromElement(textRegister);
    }
    public void setLogin()
    {
        //2.2 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Login”
        clickOnElement(login);
    }
    public void setText()
    {
        //2.3 Verify the text “Returning Customer”.
        getTextFromElement(text);

    }
    public void setFirstName()
    {
        //3.3 Enter First Name
        sendTextToElement(firstName,"radha");

    }
    public void setLastName()
    {
        //3.4 Enter Last Name
        sendTextToElement(lastName,"Krishna");
    }
    public void setEmail()
    {
        //3.5 Enter Email
        sendTextToElement(email,"radhakrishna@gmail.com");
    }
    public void setTelephone()
    {
        //3.6 Enter Telephone
        sendTextToElement(telephone,"7866569045");
    }
    public void setPassword()
    {
        //3.7 Enter Password
        sendTextToElement(password,"radha8899");
    }
    public void setConfirmPassword()
    {
        //3.8 Enter Password Confirm
        sendTextToElement(confirmPassword,"radha8899");
    }
    public void setRedioButton()
    {
        //3.9 Select Subscribe Yes radio button
        selectByContainsTextFromListOfElements(redioButton,"Yes");
    }
    public void setPrivacy()
    {
        //3.10 Click on Privacy Policy check box
        clickOnElement(privacy);
    }
    public void setContinueButton()
    {
        //3.11 Click on Continue button
        clickOnElement(continueButton);
    }
    public void setMessage()
    {
        //3.12 Verify the message “Your Account Has Been Created!”
        getTextFromElement(message);
    }
    public void setGetContinueButton()
    {
        //3.13 Click on Continue button
        clickOnElement(getContinueButton);
    }
    public void setLink()
    {
        //3.14 Clickr on My Account Link.
        clickOnElement(link);
    }
    public void logOut()
    {
        //3.15 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Logout”
        clickOnElement(logOut);
    }
    public void setText1()
    {
        //3.16 Verify the text “Account Logout”
        getTextFromElement(text1);
    }
    public void continueButton()
    {
        //3.17 Click on Continue button
        clickOnElement(getContinueButton1);
    }
}
