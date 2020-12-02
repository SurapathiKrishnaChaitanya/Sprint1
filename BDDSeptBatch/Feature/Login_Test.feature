Feature: Login and logout action

Background: Move to login page
Given User is on home page
When navigate to login page

Scenario: Successful Login with Valid Credentials
Given user is on Home Page
When User Navigate to Login Page
And User enters UserName and Password
Then message displayed login successfully

Scenario Outline: Successful login with login and password
Given user is on Home page
When user navigate to login page
And user enters <"username"> and <"password">
Then message displayed login successfully

Scenario: Logout from the login page
Given user is on login page
When user clicks log out button
Then Logged out successfully

Examples:

| username | password |
| krishna | krishna@123 |
| chaitanya | chaitanya@123 |