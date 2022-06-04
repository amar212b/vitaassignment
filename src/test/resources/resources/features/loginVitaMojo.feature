@login
Feature: Login to Vita Mojo Demo website

  @tag1
  Scenario Outline: register and create account on demo website
    Given User is on Demo Landing page
    When user clicks on Login button
    Then Login screen should be displayed
    When user clicks on CreateAccountPage button
    Then Create Page screen should be displayed
    And user enters the <Name> <Email address> and <password> 
    And clicks on CreateAccount button
    Then "Our Stores" text should be displayed in the main page
    And <Name> must be displayed

	Examples:
	| Name  |Email address   |password  |
	| amar  |amar@gmail.com  |amar@1234 |

 