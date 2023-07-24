
Feature: Payment-To_user


Background: User should login in and click the Banking Menu
	Given User Should  navigate to the login page
	When User should submit username and password and login to the application
	And User should click the Banking Menu and Payment to user
	And Click the contact and select a contact

Scenario: User Should enter the valid amount and  proceed 
 Given User should enter the valid amount 
	When User Should select Paynow Option From the Dropdown
	And User Should type Description1 if needed
	Then User Should click the next button and confirm button in the next Page and check the payment info1
	
Scenario: User Should enter invalid amount  and proceed
  Given User should enter the invalid amount 
  When User Should select  Option From the Dropdown
	And User Should type Description2 if needed
	Then User Should click the next button and confirm button in the next Page and	check the payment info2
