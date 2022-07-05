package com.examen.view;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class MenuScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView\n")
    private WebElement titleProductos;

    public String getTitle(){
        getDriver().manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);
        return titleProductos.getText();
    }
}
