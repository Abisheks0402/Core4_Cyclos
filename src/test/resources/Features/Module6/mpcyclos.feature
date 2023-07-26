@tag
Feature: Launch the Cyclos App

Background: The launch the cyclos application
Given click My Advertisement


@tag1
Scenario: To launch the Cyclos App
Given User verifying and validating the user and password
Then User should click on My Advertisement menu
When User should click on add new button and New Advertisement page to be display
And User should give the name
And User should click on the category
When User should enter a text in description textbox
Then User should click save button


@tag2
Scenario: User should click on the publication period
Given User should click on the publication period1
And User should click on the publication period2

 

@tag3
Scenario: User should scroll down to the showmap
Given User should want to click on the showmap

 
@tag4
Scenario: Click on the filters
Given User should click on the filters
When User should enter the text Food in given keyword textbox
And User should click favorites radio button
And User should give minimum price
And User should give maximum price

 
@tag5
Scenario: Click the dropdown
Given User should click on Order By dropdown
And User should select the user choice
And User should click on the keywords
And User should click on the show advertisements


@tag6
Scenario: Click on the community
Given User should click on the community
And User should click Community related Advertisements display
And User should click on the activites
Then User should click on any categories in activity

 

 

 

 

 

 

 

 