@wip
Feature: Logout-1-2 As a user I should be able to log out

  Background:
    Given The user is on the homepage

  Scenario: User can log out by using log out button inside
  profile info and ends up in login page

    When User clicks username on the profile menu
    And User clicks logout btn inside profile menu
    Then User lands on the login page
