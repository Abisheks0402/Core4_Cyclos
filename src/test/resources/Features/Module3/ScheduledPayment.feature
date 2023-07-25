Feature:  Payment Request

Background: User should Login and click the Payment Request button
Given User should give the valid credentials and login to the application
And User should click the Payment Request Button and proceed
And user should click the send a new request menu 

Scenario: User should sent a payment request
Given User Should Enter a amount value
And User should enter a date
And User should Select dropdown and select Monthly Installment
And User should ghive number of installment
And User should fill discription if needed and click the next button
And User should accept the popup




