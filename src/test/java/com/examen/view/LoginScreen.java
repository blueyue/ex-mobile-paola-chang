package com.examen.view;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class LoginScreen extends PageObject {

    @AndroidFindBy(id = "test-Username")
    private WebElement editTextUser;
    @AndroidFindBy(id = "test-Password")
    private WebElement editTextPasswd;
    @AndroidFindBy(id = "test-LOGIN")
    private WebElement btnLogin;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")
    private WebElement msjDeAlerta;

    public void loguear(String user,String passwd){
        getDriver().manage().timeouts().implicitlyWait(5 ,TimeUnit.SECONDS);
        editTextUser.sendKeys(user);
        editTextPasswd.sendKeys(passwd);
        getDriver().manage().timeouts().implicitlyWait(5 ,TimeUnit.SECONDS);
        btnLogin.click();

    }
    public String error(){
        return msjDeAlerta.getText();
    }
}
