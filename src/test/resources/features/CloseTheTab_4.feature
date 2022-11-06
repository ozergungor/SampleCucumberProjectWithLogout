@CloseTheTab
Feature: Logout-4 As a user I should be able to log out

  AC: The user must be logged out if the user close the tab
      (if there are multiple open tabs in the app, close all of them)

  Background:
    Given The user is on the homepage

  Scenario: User must be logged out if the user close the tab

    When User opens a new tab and logs in
    And User closes all tabs
    And User opens a new login page again
    Then User can not go to the home page again




