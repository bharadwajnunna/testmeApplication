
Feature: Login in TestMe App

Scenario: Validate login function  
    Given I have chosen to login
    When user enters valid username and password
    Then user clicks on login button
    And user logins successfully and navigate to home page


	