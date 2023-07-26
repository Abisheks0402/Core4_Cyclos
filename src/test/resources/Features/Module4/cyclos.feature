Feature: Open Cyclos application

Scenario: Launch Cyclos application

Given User verifying and validating the user and password
When User verify the “Message” icon and "New message"
And User choose User in "Sent to" dropdown
Then User give the name of the contact to the "To Users"
And User verify the "Subject"
Then User give some words to the description and verify the "Send" button
