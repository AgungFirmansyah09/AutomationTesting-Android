package com.example.steps;

import com.example.app.pages.ListPage;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ListPageMyStepDf {
    ListPage listPage = new ListPage();
    LoginPage loginPage = new LoginPage();

    @When("user do swipe up on list data")
    public void userDoSwipeUpOnListData() {
        listPage.swipeUp();
    }

    @When("user long press list data")
    public void userLongPressListData() {
        listPage.LongPress();

    }

    @Then("user multiple tap list data")
    public void userMultipleTapListData() {
        listPage.MultipleTap();
    }

}
