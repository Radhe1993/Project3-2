package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class LaptopsAndNotebooksTest extends Utility
{
    By laptop = By.linkText("Laptops & Notebooks");
    By allLaptop = By.linkText("Show AllLaptops & Notebooks");
    List<Double> originalProductsPrice = new ArrayList<>();
    By price = By.id("input-sort");
    ArrayList<Double> afterSortByPrice = new ArrayList<>();
    By price1 =  By.id("input-sort");
    By macBook = By.linkText("MacBook");
    By textMacbook = By.xpath("//h1[contains(text(),'MacBook')]");
    By addToCart = By.xpath("//button[@id='button-cart']");
    By message = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");
    By textShopping = By.xpath("//div[@id='content']//h1");
    By productName = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By qty = By.xpath("//input[contains(@name, 'quantity')]");
    By update = By.xpath("//button[contains(@data-original-title, 'Update')]");
    By getMessage = By.xpath("//div[@id='checkout-cart']/div[1]");
    By total = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    By checkOut = By.xpath("//a[contains(text(),'Checkout')]");
    By textCheckOut=By.xpath("//h1[contains(text(),'Checkout')]");
    By newCostumer = By.xpath("//h2[contains(text(),'New Customer')]");
    By guestButton  = By.xpath("//input[@name='account'][@value='guest']");
    By continuebutton = By.xpath("//input[@id='button-account']");
    By firstName = By.xpath("//input[@id='input-payment-firstname']");
    By lastName = By.xpath("//input[@id='input-payment-lastname']");
    By email = By.xpath("//input[@id='input-payment-email']");
    By number = By.xpath("//input[@id='input-payment-telephone']");
    By address = By.xpath("//input[@id='input-payment-address-1']");
    By city = By.xpath("//input[@id='input-payment-city']");
    By postcode = By.xpath("//input[@id='input-payment-postcode']");
    By Country = By.xpath("//select[@id='input-payment-country']");
    By state = By .id("input-payment-zone");
    By ContinueButton1 = By.xpath("//input[@id='button-guest']");
    By comments = By.name("comment");
    By teams = By.name("agree");
    By ContinueButton2 = By.id("button-payment-method");
    By warning = By.className("alert alert-danger alert-dismissible");

    public void setLaptop()
    {
        //1.1 Mouse hover on Laptops & Notebooks Tab.and click
        mouseHoverToElement(laptop);
    }
    public void setAllLaptop()
    {
        //1.2 Click on “Show All Laptops & Notebooks”
        clickOnElement(allLaptop);
    }
    public void originalProductsPrice()
    {
        //1.3 Select Sort By "Price (High > Low)"
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));

        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        System.out.println(originalProductsPrice);
    }
    public void setPrice()
    {
        //1.4 Verify the Product price will arrange in High to Low order.
        selectByVisibleTextFromDropDown(price,"Price (High > Low)");
    }
    public void afterSortByPrice()
    {
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));

        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        System.out.println(afterSortByPrice);
    }
    public void setPrice1()
    {
        //2.3 Select Sort By "Price (High > Low)"
        selectByVisibleTextFromDropDown(price1,"Price (High > Low)");

    }
    public void setMacBook()
    {
        //2.4 Select Product “MacBook”
        clickOnElement(macBook);
    }
    public void setTextMacbook()
    {
       //2.5 Verify the text “MacBook
        getTextFromElement(textMacbook);
    }
    public void setAddToCart()
    {
        //2.6 Click on ‘Add To Cart’ button
        clickOnElement(addToCart);
    }
    public void setMessage()
    {
        //2.7 Verify the message “Success: You have added MacBook to your shopping cart
        getTextFromElement(message);
    }
    public void setShoppingCart()
    {
        //2.8 Click on link “shopping cart” display into success message
        clickOnElement(shoppingCart);
    }
    public void setTextShopping()
    {
        //2.9 Verify the text "Shopping Cart"
        getTextFromElement(textShopping);
    }
    public void productName()
    {
        //2.10 Verify the Product name "MacBook"
        getTextFromElement(productName);
    }
    public void setQty()
    {
        //2.11 Change Quantity "2"
        remove(qty,"2");

    }
    public void setUpdate()
    {
        //2.12 Click on “Update” Tab
        clickOnElement(update);
    }
    public void setGetMessage()
    {
        //Verify the message “Success: You have modified your shopping cart!”
        getTextFromElement(getMessage);
    }
    public void setTotal()
    {
        //2.14 Verify the Total £737.45
        getTextFromElement(total);
    }
    public void setCheckOut()
    {
        //2.15 Click on “Checkout” button
        clickOnElement(checkOut);
    }
    public void setTextCheckOut()
    {
        //2.16 Verify the text “Checkout”
        getTextFromElement(textCheckOut);
    }
    public void  setNewCostumer()
    {
        //2.17 Verify the Text “New Customer”
        getTextFromElement(newCostumer);
    }
    public void setGuestButton()
    {
        //2.18 Click on “Guest Checkout” radio button
        clickOnElement(guestButton);

    }
    public void setContinuebutton()
    {
        //2.19 Click on “Continue” tab
        clickOnElement(continuebutton);
    }
    public void mandatoryField()
    {
        //2.20 Fill the mandatory fields
        sendTextToElement(firstName,"Siya");
        sendTextToElement(lastName,"Ram");
        sendTextToElement(email,"siyaRam@gmail.com");
        sendTextToElement(number,"9865908756");
        sendTextToElement(address,"35,silver");
        sendTextToElement(city,"surat");
        sendTextToElement(postcode,"lp80ty");
        selectByVisibleTextFromDropDown(Country,"India");
        selectByVisibleTextFromDropDown(state,"Gujarat");

    }
    public void setContinueButton1()
    {
        //2.21 Click on “Continue” Button
        clickOnElement(ContinueButton1);
    }
    public void setComments()
    {
        //2.22 Add Comments About your order into text area
        sendTextToElement(comments,"Nice Product");
    }
    public void setTeams()
    {
        //2.23 Check the Terms & Conditions check box
        clickOnElement(teams);
    }
    public void setContinueButton2()
    {
        //2.24 Click on “Continue” button
        clickOnElement(ContinueButton2);
    }
    public void setWarning()
    {
        //2.25 Verify the message “Warning message
        getTextFromElement(warning);
    }



}
