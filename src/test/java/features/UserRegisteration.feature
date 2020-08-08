Feature:
user registeration
Scenario Outline:
when user enter his valid data he can register successfully

Given userin dashboard page
When enter his information"<firstname>","<lastname>","<email>","<confirmEmail>","<password>"
And click on sign up button
Then user can register successfully
Examples:
|firstname|lastname|email|confirmEmail|password|
|mohammed|kamal|mk@email.com|mk@email.com|Kimo123456|
|mo|ka|mkamal@email.com|mkamal@email.com|Kimo321|
|test|testing|test@test.com|test@test.com|test123|
