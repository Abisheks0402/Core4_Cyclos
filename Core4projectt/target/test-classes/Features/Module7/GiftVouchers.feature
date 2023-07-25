Feature: Gift voucher

Background: User should login and click the market place  and voucher menu
Given User  should login using valid credentials given
And User should click Market place and My voucher Menu

Scenario: User should click a voucher and print
Given User should click a displayed voucher 
When User should click the print button and print 
And User should check the printed voucher

Scenario: User should buy a new voucher
Given User should click a voucher button1
And User should fill the form and click the next button