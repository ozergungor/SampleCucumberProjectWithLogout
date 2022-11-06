@StepBackBtn
Feature: Logout-3 As a user I should be able to log out

  AC: The user can not go to the home page again by clicking
      the step back button after successfully logged out

  Background:
    Given The user is on the homepage

  Scenario: User can not go to the home page again by clicking
            the step back

    When User clicks username on the profile menu
    And User clicks logout btn inside profile menu
    And User lands on the login page
    And User clicks stepback btn
    Then User can not go to the home page again
