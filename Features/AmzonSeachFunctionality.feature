Feature: Login to Amazon Mobile App, Search an Item and Buy

@sanity
Scenario: Successful Login with Valid Credentials 
	Given User Launch Amazon Mobile App and select on "Already a customer? Sign in" Already a customer? Sign in Option
	And User Enter the Email as "manjunathqa21@gmail.com"
	And User clicks on "Continue" Continue button
	And User Enter Password as "ManjuQA@21" and clicks on "Sign In" Sign In Button
	And User is Landed to Amazon Home page
	And User Entered the search as "65-inch TV" 
	Then User should select the Items Randomly
	And User should able to buy the selected Item
	