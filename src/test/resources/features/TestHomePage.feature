@Test
Feature: Test home page functionality

Scenario: Access to login window
Given the user is on the home page
When the user clicks sign in
Then the user is redirected to sign in window

Scenario: Access to favorites 
Given user is on the home page
When the user clicks favorites
Then the user can see their saved favorite items

Scenario: Access to cart
Given the user on home page
When the user clicks cart
Then the user is redirected to their cart items

