Feature:  OrangeHRMlogin
Scenario: login with valid credentials
Given User able to launch the browser
When User able to load the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
Then User able to enter username "Admin" and password "admin123"
And click on login
Then page title should be"OrangeHRM"
And close the browser