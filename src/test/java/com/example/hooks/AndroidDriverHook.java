package com.example.hooks;

import com.example.app.driver.AndroidDriverInit;
import com.ibm.icu.util.Output;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import net.thucydides.core.model.TakeScreenshots;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class AndroidDriverHook {

    @Before(value = "@Android")
    public void beforeScenario (){
        AndroidDriverInit.initialize();
    }

    @After (value = "@Android")
    public void afterScenario (Scenario scenario){
        if (scenario.isFailed()){
            TakesScreenshot screenshot = AndroidDriverInit.driver;
            byte[] imageArray = screenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(imageArray, "image/png", "screenshot");
        }
        AndroidDriverInit.destroy();

    }
}
