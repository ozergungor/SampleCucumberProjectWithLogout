@UserIsAFK
Feature: User logs out if AFK for 3 min

  AC: The user must be logged out if the user is away from keyboard for 3 minutes (AFK)
      (if the user does not do any mouse or keyboard action for 3 minutes)

  Background:
    Given The user is on the homepage

  Scenario: User must be logged out if the user is AFK for 3 min

    When User is AFK for 3 min
    Then User lands on the login page
