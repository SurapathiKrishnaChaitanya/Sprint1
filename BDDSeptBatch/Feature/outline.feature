Feature: Scenario outline example

Scenario Outline: Login with valid username and password
Given user on home page
When user navigates to login page
And user enters <"username"> and <"password"> 
Then login successfully

Examples:

| username | password |
| chaitanya | chaitanya@312 |
| krishna | krishna@123 |