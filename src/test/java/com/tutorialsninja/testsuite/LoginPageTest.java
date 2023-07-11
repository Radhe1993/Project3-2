package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopsTest;
import com.tutorialsninja.pages.LaptopsAndNotebooksTest;
import com.tutorialsninja.pages.MyAccountsTest;
import com.tutorialsninja.pages.TopMenuTest;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest
{
    TopMenuTest top = new TopMenuTest();
    DesktopsTest destops = new DesktopsTest();
    LaptopsAndNotebooksTest laptop = new LaptopsAndNotebooksTest();
    MyAccountsTest myAccount = new MyAccountsTest();
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully()
    {
        top.desktop();
        top.setSelectMenu();
        top.textDesktop();
        String expected = "Desktops";
        String actual = getTextFromElement(By.xpath("//h2[contains(text(),'Desktops')]"));
        Assert.assertEquals(actual,expected);


    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully()
    {
        top.setLaptop();
        top.setAllNotBooks();
        top.textBooks();
        String expected = "Laptops & Notebooks";
        String actual =getTextFromElement(By.xpath("//h2[contains(text(),'Laptops & Notebooks')]")) ;
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully()
    {
        top.setComponents();
        top.allComponents();
        top.setTextComponents();
        String expected = "Components";
        String  actual =getTextFromElement(By.xpath("//h2[contains(text(),'Components')]"));
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void verifyProductArrangeInAlphaBaticalOrder()
    {
        destops.desktop();
        destops.setSelectMenu();
        destops.origibalproduct();
        destops.selectZtoA();
        destops.afterSortByZToAProductsName();
        String expected = "Sony VAIO";

        String actual = getTextFromElement(By.xpath("//h4/a"));
        Assert.assertEquals(actual,expected);


    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully()
    {
        destops.desktop();
        destops.setSelectMenu();
        destops.AtoZ();
        destops.setHP();
        destops.verifyTextHP();
        destops. setDate();
        destops.setQty();
        destops.setAddToCart();
        destops.message();
        destops.setShoppingCart();
        destops.setTextCart();
        destops.setProductName();
        destops.deliveryDate();
        destops.setModel();
        destops.setTotal();
    }
    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully()
    {
        laptop.setLaptop();
        laptop.setAllLaptop();
        laptop.originalProductsPrice();
        laptop.setPrice();
        laptop.afterSortByPrice();
        laptop.setPrice1();
        laptop.setMacBook();
        laptop.setTextMacbook();
        laptop. setAddToCart();
        laptop.setMessage();
        laptop.setShoppingCart();
        laptop.setTextShopping();
        laptop.productName();
        laptop.setQty();
        laptop.setUpdate();
        laptop.setGetMessage();
        laptop.setTotal();
        laptop.setCheckOut();
        laptop.setTextCheckOut();
        laptop.setNewCostumer();
        laptop.setGuestButton();
        laptop.setContinuebutton();
        laptop.mandatoryField();
        laptop.setContinueButton1();
        laptop.setComments();
        laptop.setTeams();
        laptop.setContinueButton2();
        laptop.setWarning();

    }
    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully()
    {
        myAccount.setMyAccount();
        myAccount.setRegister();
        myAccount.setTextRegister();
    }
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully()
    {
        myAccount.setMyAccount();
        myAccount.setLogin();
        myAccount.setText();
    }
    @Test
    public void verifyThatUserRegisterAccountSuccessfully()
    {
        myAccount.setMyAccount();
        myAccount.setRegister();
        myAccount.setFirstName();
        myAccount.setLastName();
        myAccount.setEmail();
        myAccount.setTelephone();
        myAccount.setPassword();
        myAccount.setConfirmPassword();
        myAccount.setRedioButton();
        myAccount.setPrivacy();
        myAccount.setContinueButton();
        myAccount.setMessage();
        myAccount.setGetContinueButton();
        myAccount.setLink();
        myAccount.logOut();
        myAccount.setText1();
        myAccount. continueButton();
    }
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully()
    {
        myAccount.setMyAccount();
        myAccount.setLogin();
        myAccount.setFirstName();
        myAccount.setLastName();
        myAccount.setEmail();
        myAccount.setPassword();
        myAccount.setLink();
        myAccount.logOut();
        myAccount.setText1();
        myAccount. continueButton();
    }


}
