package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import static com.example.app.driver.AndroidDriverInit.driver;

public class LoginPage extends BasePageObject {

    public void  inputUsername (String username){
//        By locator = MobileBy.id("username");
//        AndroidElement txtFieldUsername = driver.findElement(locator);
//        txtFieldUsername.clear();
//        txtFieldUsername.sendKeys(username);
        type(MobileBy.id("username"), username);
    }

    public void  inputPassword (String password){
//        By locator = MobileBy.id("password");
//        AndroidElement txtFieldPassword = driver.findElement(locator);
//        txtFieldPassword.clear();
//        txtFieldPassword.sendKeys(password);
        type(MobileBy.id("password"), password);

    }

    public void  ClickLoginButton (){
//        By locator = MobileBy.id("login");
//        AndroidElement btnLogin = driver.findElement(locator);
//        btnLogin.click();

        click(MobileBy.id("login"));

    }
}
