package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class TopMenuTest extends Utility
{
    By desktop = By.linkText("Desktops");
    By selectMenu = By.xpath("//a[contains(text(),'Show AllDesktops')]");
    By textDesktop = By.xpath("//h2[contains(text(),'Desktops')]");
    By laptop = By.linkText("Laptops & Notebooks");
    By allNotBooks = By.xpath("//a[contains(text(),'Show AllLaptops & Notebooks')]");
    By textBooks = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    By Components = By.linkText("Components");
    By AllComponents = By.xpath("//a[contains(text(),'Show AllComponents')]");
    By textComponents = By.xpath("//h2[contains(text(),'Components')]");


    public void desktop()
    {
        mouseHoverToElement(desktop);
    }
    public void setSelectMenu()
    {
        clickOnElement(selectMenu);
    }
    public void textDesktop()
    {
        getTextFromElement(textDesktop);

    }
    public void setLaptop()
    {
        mouseHoverToElement(laptop);
    }
    public void setAllNotBooks()
    {
        clickOnElement(allNotBooks);
    }
    public void textBooks()
    {
        getTextFromElement(textBooks);
    }
    public void setComponents()
    {
        mouseHoverToElement(Components);
    }
    public void allComponents()
    {
        clickOnElement(AllComponents);
    }
    public void setTextComponents()
    {
        getTextFromElement(textComponents);
    }
}
