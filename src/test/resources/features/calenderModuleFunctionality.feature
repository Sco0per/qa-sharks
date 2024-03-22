@B32G22-250
Feature: Default

	
	@B32G22-246
	Scenario:  User can display daily calendar view
		Given User is on Main page
		When User clicks the Calender button
		Then User see's "Calendar" in the title

	
	@B32G22-247
	Scenario: User can display weekly calendar view
		Given User is on Main page
		When User clicks the Calender button
		Then User click Calender selections button
		And User selects Week view
		Then User  should see's "Week"  in title

	
	@B32G22-248
	Scenario: User can display monthly calendar view
		Given User is on Main page
		When User clicks the Calender button
		Then User click Calender selections button
		And User selects monthly view
		Then User see's "March" in title

	
	@B32G22-249
	Scenario: User can create a new event under the Calendar module and see it on the related day through the Monthly Calendar view
		Given User is on Main page
		When User clicks the Calender button
		When User clicks New Event  button
		And User enters Event title
		And User enters Starting date
		And User enters Ending date
		And User clicks Save button
		Then user should see a new event saved under the Calender module