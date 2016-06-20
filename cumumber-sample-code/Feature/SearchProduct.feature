#Author: karansawhney1991@gmail.com
#Keywords Summary : Sample Cucumber Project for training purpose
Feature: Search Products on E-commerce platform.

  Scenario: Search Samsung Galaxy S7 on flipkart
    Given User is on Flipkart home page
    When user enter product name in search bar
    And user clicks on search button
    Then user is displayed all the products which matches search result
    And user selects white product.
