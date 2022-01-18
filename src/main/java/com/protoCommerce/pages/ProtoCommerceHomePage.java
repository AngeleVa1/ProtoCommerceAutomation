package com.protoCommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProtoCommerceHomePage {
    //sign in
    WebDriver driver;
    String username = "Angele";
    String email = "angele@gmail.com";
    String password = "viensDU3/";
    String date = "01182022";
    String gender = "Female";

    public ProtoCommerceHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(name = "name")
    WebElement nameBox;

    @FindBy(xpath = "//input[@name='email']")
    WebElement emailBox;

    @FindBy(xpath = "//input[@id='exampleInputPassword1']")
    WebElement passwordBox;

    @FindBy(id = "exampleCheck1")
    WebElement checkMeButton;

    @FindBy(xpath = "//select[@id='exampleFormControlSelect1']")
    List<WebElement> listOfGenders;

    @FindBy(xpath = "//input[@id='inlineRadio1']")
    WebElement studentButton;

    @FindBy(xpath = "//input[@name='bday']")
    WebElement dateBox;

    @FindBy(xpath = "//input[@value='Submit']")
    WebElement submitButton;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successMessage;


    public List<WebElement> countryButton() {
        ;
        return listOfGenders;
    }

    public void nameBox() {
        nameBox.sendKeys(username);
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        checkMeButton.click();
        studentButton.click();
        dateBox.sendKeys(date);
        submitButton.click();

    }
    public String successMessage() {
        return successMessage.getText();
    }



}
