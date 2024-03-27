@wip-maya2
Feature: File Module Functionality/Favorites (Automation)

  Agile story: As a user, I should be able to add a file to favorites, rename any file and give some comments on
  any file.

  Background:
    Given as a user i should be able to login with valid credentials
    Given user is already on Files page
    Given user is on the action menu from three dots


  Scenario: User can add any file to favorites from its own three dots menu.

    Then user chooses a file to make it favotite
    And verify that selected package or file is as favorite now


  Scenario: User can rename any file from its own three dots menu.

    Then user clicks on the Rename option
    And user renames it
    Then Verify that file has been renamed


  Scenario: User can put some comments on any file from the file details menu opened right side.

    Then user click to Details option
    And user hover overs to the Comments button
    Then user adds comments
    And verify if comment has been displayed