Feature: Account information of Cyclos Web Application 
	user Should be able to perform Banking Functionality
	
	
	
	Scenario: Banking Functioality of Cyclos Application
		Given User login into Cyclos
		Then User should click on banking1
		And check the memberAccount
		
	
	
	Scenario: user check the current balance
		Given Goto the banking menu
		Then check member account balance
		
	
	Scenario: user should check the payment history
		Given User click on banking menu2
		When click on notifications
		Then able to see payment history
		
	
	Scenario: print and export payments 
		Given user able click on banking menu3
		Then should click payment to users
		Then select one user from userlist and select a user
		And Enter amount
		Then click anyOption from Scheduling
		And click on Next button
		Then click on confirm
		Then click on print to download
	

	Scenario: Searching the payments
		Given User Should click on Banking Menu4
		And click the showfilter button
		And select a user from userlist
		Then click on period menu and select any opton
		And select description and enter content
		Then click on from amout and enter value
		Then click on to amount and enter value
		And click on filter and select one option
		Then click on transaction number and enter value
		And click on direction and select one option
		Then click on orderby and select one option
		
	

	Scenario: view payment details
		Given should be able to click on banking menu5
		When click a user from Account summary
		Then payment details should be display
		

	Scenario: payment details should be print
		Given user able to click banking menu6
		When click any user from 	account summary
		Then print the transferDetails
		