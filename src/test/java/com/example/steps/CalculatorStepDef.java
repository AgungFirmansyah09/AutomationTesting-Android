package com.example.steps;

import com.example.app.pages.CalculatorPage;
import com.example.app.pages.LoginPage;
import com.example.app.pages.NavigationMenu;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CalculatorStepDef {
    CalculatorPage calculatorPage = new CalculatorPage();
    NavigationMenu navigationMenu = new NavigationMenu();
    LoginPage loginPage = new LoginPage();

    @Given("user login using username {string} and password {string}")
    public void userLoginUsingUsernameAndPassword(String username, String password) {
        loginPage.inputUsername(username);
        loginPage.inputPassword(password);
        loginPage.ClickLoginButton();
    }

    @Given("user is on calculator page")
    public void userHasLoginAplication() {

    }

    @When("user input Angka pertama {string}")
    public void userInputAngkaPertama(String AngkaPertama) {
        calculatorPage.InputAngkaPertama(AngkaPertama);
    }

    @When("user click button spinner")
    public void userClickButtonSpinner() {
        calculatorPage.ClickSpinnerCalculate();

    }

    @When("user choose calculate Addition")
    public void userChooseCalculateAddition() {
        calculatorPage.ClickSelectorAddition();
    }

    @When("user choose calculate Reduction")
    public void userChooseCalculateReduction() {
        calculatorPage.ClickSelectorReduction();
    }

    @When("user choose calculate Multiplication")
    public void userChooseCalculateMultiplication() {
        calculatorPage.ClickSelectorMultiplication();
    }

    @When("user choose calculate Division")
    public void userChooseCalculateDivision() {
        calculatorPage.ClikSelectorDivision();
    }

    @When("user input Angka kedua {string}")
    public void userInputAngkaKedua(String AngkaKedua) {
        calculatorPage.InputAngkaKedua(AngkaKedua);
    }



    @When("user click button hasil")
    public void userClickButtonHasil() {
        calculatorPage.ClickBottonHasil();
    }

    @Then("user can view result {string}")
    public void userSuccessfullyUsingCalculator(String hasil) {
        String hasilAddition = navigationMenu.checkElementDisplayedHasil();
        Assertions.assertEquals("Hasil : " + hasil, hasilAddition);
    }

}
