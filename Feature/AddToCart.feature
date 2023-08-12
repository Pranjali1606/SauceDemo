Feature: Checkout Feature
  
  Scenario: To validate checkout feature
    Given user launch the application
    When user enter username and password as "standard_user" and "secret_sauce"
    And user click  on login button 
    Then user get name and price of first available item
    And user click on add to cart button 
    And user navigate to cart
    And user continue to checkout the item
    And user fill the details for delivery
    Then user verify the confirmation message

 
  
