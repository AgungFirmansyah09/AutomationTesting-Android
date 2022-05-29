package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Point;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class ListPage extends BasePageObject {
    public void swipeUp(){
//        TouchAction action = new TouchAction(getDriver());
//        AndroidElement containerList = find(MobileBy.id("recycler_view"));
//        // Get coordinate
//
//        Point center = containerList.getCenter();
//        PointOption start = PointOption.point(center);
//        PointOption end = PointOption.point(center.getX(), center.getY()- 1000);
//
//        // action builder
//        action
//                .press(start)
//                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
//                .moveTo(end)
//                .release()
//                .perform();

        AndroidElement element = find(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"List ke-15\"))"));
        element.click();
        waitAbit(3);

    }

    public void LongPress (){
        TouchAction action = new TouchAction(getDriver());
        AndroidElement element = find(MobileBy.id("recycler_view"));
        action.longPress(PointOption.point(element.getCenter()))
                .waitAction(WaitOptions.waitOptions(
                        Duration.of(10, ChronoUnit.SECONDS)
                )).release()
                .perform();
    }

    public void MultipleTap (){
        TouchAction action = new TouchAction(getDriver());
        AndroidElement tapelement = find(MobileBy.id("recycler_view"));
        action.tap(TapOptions.tapOptions().withTapsCount(10)
                .withElement(ElementOption.element(tapelement)))
                .perform();

    }
}
