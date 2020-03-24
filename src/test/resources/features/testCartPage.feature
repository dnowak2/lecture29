@testCart
Feature: Test Cart webpage from H&M website

Scenario: Read number of items in cart

Given User is on cart webpage
When There are is at least one item in cart
Then Console prints how many items there are in cart