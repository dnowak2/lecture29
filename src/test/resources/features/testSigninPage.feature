@test 
Feature: Verification that the sign in page will read error message with wrong format
Scenario: When the user inputs an incorrect format the error message will be shown
	Given the user inputs "username" and "password" in the insert fields
	When  the user clicks sign in
	Then incorrect format message will appear

