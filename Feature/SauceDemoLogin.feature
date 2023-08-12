Feature: To validate login page

  Scenario Outline: To validate login functionality with valid inputs
    Given user launch the application with "<url>"
    When user enter valid username "<username>"
    And user enter valid password "<password>"
    And user click login button 
    Then user should be logged in successfully
   
    Examples: 
      |url|username|password|
      |http://www.saucedemo.com/|standard_user|secret_sauce|
      |http://www.saucedemo.com/|problem_user|secret_sauce|
      |http://www.saucedemo.com/|performance_glitch_user|secret_sauce|
      
  Scenario Outline: To validate login functionality with invalid inputs
    Given user launch the application with "<url>"
    When user enter invalid inputs as "<username>" and "<password>"
    And user click login button 
    Then user should see some error message
    
     Examples: 
      |url|username|password|
      |http://www.saucedemo.com/|user|sauce|
      |http://www.saucedemo.com/|locked|secret|