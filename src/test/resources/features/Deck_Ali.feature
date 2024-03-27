@B32G22-277
Feature: User should be able to manage works by creating a new board/list/card and modifying them under Deck Module.

	Background:
		#@B32G22-278
		Then the user logged in with username as "User22" and password as "Userpass123"
		#@B32G22-272
		Given user clicks "deck" from dashboard
		#@B32G22-273
		Then user click deck navigation button
		

	@B32G22-271
	Scenario: Verify user can create a new board
		Scenario: Verify user can create a new board
		    Then user clicks Add board button
		    Then user enters "Test board Ali" as the board name
		    Then user sees "Test board Ali" in all boards list	


	@B32G22-274
	Scenario: Verify user can create a new list of card/task under any board
		Then user opens "Test board Ali" board
		When user click add list
		Then user enters "Test list Ali" as the list name
		Then user should see "Test list Ali" under the board	


	@B32G22-275
	Scenario: Verify user can add a new card/task on any list on the current board
		Then user opens "Test board Ali" board
		    When user click add card to "Test list Ali" and enters name "Test card Ali"	

	
	@B32G22-276
	Scenario: Verify user can assign any card/task to himself/herself by using the three dots on the related card
		Then user opens "Test board Ali" board
		    When user click three dots under the task "Test card Ali" and click assign to me button