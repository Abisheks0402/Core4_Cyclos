
Feature: Payment-To_System

Background: User should login and click the Banking Menu
Given User should navigate to the login page and give the valid credentials and proceed
And User should click the Banking Menu and Payment to System

Scenario: User should should enter the valid amount
When User should click the scheduled option
And User should give the description if needed
And user should enter the date
And User should click the next button and proceed
 
 
Scenario: User should should enter the invalid amount
When User should click the scheduled option first
And user should enter the date and description
And User should click the next button 