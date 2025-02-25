Feature: Customer
 
 Scenario: Add new Customer
 Given User launch the chrome browser
 When  User open the URL "https://admin-demo.nopcommerce.com/login"
 Then User enter email as"admin@yourstore.com" and password as"admin"
 And Click on login
 Then User can view the Dashboard
 When User click on customers menu
 And User click on customer menu item
 And User click on Add new button
 Then user can view  Add new customer page
 When user enter customer info
  And click on save button
   Then User able to see confirmation message "The new customer has been added successfully"
   And  close browser