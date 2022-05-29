@Calculator @Android
Feature: Calculator

  Background: user is already login application
    Given user login using username "admin" and password "admin"

  @Calculator @Penjumlahan
  Scenario: user successfully using calculator in Addition
    Given user is on calculator page
    When user input Angka pertama "9"
    When user click button spinner
    When user choose calculate Addition
    When user input Angka kedua "12"
    When user click button hasil
    Then user can view result "21"

  @Calculator @Pengurangan
  Scenario: user successfully using calculator in Reduction
    Given user is on calculator page
    When user input Angka pertama "20"
    When user click button spinner
    When user choose calculate Reduction
    When user input Angka kedua "12"
    When user click button hasil
    Then user can view result "8"

  @Calculator @Pembagian
  Scenario: user successfully using calculator in Division
    Given user is on calculator page
    When user input Angka pertama "50"
    When user click button spinner
    When user choose calculate Division
    When user input Angka kedua "2"
    When user click button hasil
    Then user can view result "25"

  @Calculator @Perkalian
  Scenario: user successfully using calculator in Multiplication
    Given user is on calculator page
    When user input Angka pertama "4"
    When user click button spinner
    When user choose calculate Multiplication
    When user input Angka kedua "5"
    When user click button hasil
    Then user can view result "20"

