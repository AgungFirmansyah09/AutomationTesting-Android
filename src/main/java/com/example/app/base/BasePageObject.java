package com.example.app.base;

import com.example.app.driver.AndroidDriverInit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import javax.naming.InitialContext;
import java.time.Duration;

public class BasePageObject<InteruptedException> {

    public AndroidDriver<AndroidElement> getDriver(){
        return AndroidDriverInit.driver;
    }

    public AndroidElement find(By locator) {
        return getDriver().findElement(locator);
    }

    public void click(By locator){
        AndroidElement element = find(locator);
        element.click();
    }

    public void type(By locator, String text){
        AndroidElement element = find(locator);
        element.clear();
        element.sendKeys(text);
    }


    public String getElementText(By locator){
        AndroidElement element = find(locator);
        return element.getText();
    }

    public String getElemetTextSelector (By locator){
        AndroidElement element = find(locator);
        return element.getText();
    }

    public void waitAbit (Integer seconds){
        try {
            Thread.sleep(Duration.ofSeconds(seconds).toMillis());

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
