package com.example.steps;

import com.example.app.pages.LoginPage;
import com.example.app.pages.NavigationMenu;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class LoginStepDef {
    LoginPage loginPage = new LoginPage();
    NavigationMenu navigationMenu = new NavigationMenu();

    @Given("user is on login page")
    public void userIsOnLoginPage() {
    }


    @When("user input username {string}")
    public void userInputUsername(String username) {
        loginPage.inputUsername(username);
    }

    @When("user input password {string}")
    public void userInputPassword(String password) {
        loginPage.inputPassword(password);
    }

    @When("user click button sign in")
    public void userClickButtonSignIn() {
        loginPage.ClickLoginButton();
    }

    @Then("user successfully login")
    public void userSuccessfullyLogin() {
        String title = navigationMenu.getMenuTitleTExt();
        Assertions.assertEquals("Calculator", title);

        boolean isDisplayed = navigationMenu.checkHamburgerMenuDisplay();
        Assertions.assertTrue(isDisplayed);
    }
}
