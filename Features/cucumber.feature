Feature: ESPN Functional tests

@TC001
Scenario Outline: Check Current Date Links errors
	Given User Launch Chrome browser
	When  entered to the <url>
	And hover over Live Score Button
	Then click on Live Scores Home button
	And click the Cricket Schedule button
	Then check todays all links are working
	And the response code is <rcode>
	Then assert all link validations <rcode>
	And close browser
	Examples:
		| url                          | rcode |
		| https://www.espncricinfo.com | 200   |


	
		
	