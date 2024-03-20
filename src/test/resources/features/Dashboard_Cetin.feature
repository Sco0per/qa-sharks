@B32G22-269
Feature: Default


		#@B32G22-265
  Background: As i user  login to the dashboard

    Given as a user i should be able to login with valid credentials


  @B32G22-266
  Scenario: Verify user can see all modules and username on the dashboard
    And  user click customize button and sees the username on the dashboard  as "User22"

    Then user able to see below list on the dashboard modules
      | Dashboard |
      | Files     |
      | Photos    |
      | Activity  |
      | Talk      |
      | Mail      |
      | Contacts  |
      | Circles   |
      | Calendar  |
      | Deck      |


  @B32G22-267
  Scenario: Verify user can click on Customize button and select any of the Widgets.
    When user click customize button

    And user sees below widget list on the customize section
      | Status            |
      | Weather           |
      | Talk mentions     |
      | Upcoming events   |
      | Upcoming cards    |
      | Important mail    |
      | Unread mail       |
      | Recommended files |
      | Recent statuses   |

    Then user able to select any of the widgets


  @B32G22-268
  Scenario: Verify user can click on Set Status button and select any of the Status options.

    When user click set status button

    And user able to see below list on the set status

      | Online         |
      | Away           |
      | Do not disturb |
      | Invisible      |


    Then select any of the Status options in the below list
      | Online         |
      | Away           |
      | Do not disturb |
      | Invisible      |
