Feature: login

Scenario: login successfully using valid credentials
Given User launch the browser
When User opens URL "https://admin-demo.nopcommerce.com/login"
And User enters Email as "admin@yourstore.com" and Password as "admin"
And Click on login
Then Page Title should be "Dashboard/ nopCommerce administration"
When User click on logout link
Then Page Title should be "Your Store. Login"
And close browser


Scenario Outline: Login Data Driven
Given User launch the browser
When User opens URL "https://admin-demo.nopcommerce.com/login"
And User enters Email as "<email>" and Password as "<password>"
And Click on login
Then Page Title should be "Dashboard/ nopCommerce administration"
When User click on logout link
Then Page Title should be "Your Store. Login"
And close browser

Examples:
|email|password|
|admin@yourstore.com|admin|
|admin@yourstore.com|admin123|
