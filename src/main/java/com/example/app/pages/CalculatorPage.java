package com.example.app.pages;

import com.example.app.base.BasePageObject;
import com.example.app.driver.AndroidDriverInit;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class CalculatorPage extends BasePageObject {


    public void InputAngkaPertama(String AngkaPertama){
        type(MobileBy.id("et_1"), AngkaPertama);
    }

    public void ClickSpinnerCalculate (){
        click(MobileBy.id("spinner_1"));
    }

    public void ClickSelectorAddition (){
        click(MobileBy.xpath("//android.widget.TextView[@index='0']"));
    }

    public void ClickSelectorReduction (){
        click(MobileBy.xpath("//android.widget.TextView[@index='1']"));
    }

    public void ClikSelectorDivision(){
        click(MobileBy.xpath("//android.widget.TextView[@index='2']"));
    }

    public void ClickSelectorMultiplication(){
        click(MobileBy.xpath("//android.widget.TextView[@index='3']"));
    }


    public void InputAngkaKedua(String AngkaKedua){
        type(MobileBy.id("et_2"), AngkaKedua);
    }


    public void ClickBottonHasil (){
        By locator = MobileBy.id("acb_calculate");
        AndroidElement BtnHasil = AndroidDriverInit.driver.findElement(locator);
        BtnHasil.click();
    }
}
