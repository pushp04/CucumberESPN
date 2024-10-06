$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/cucumber.feature");
formatter.feature({
  "name": "ESPN Functional tests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Check Current Date Links errors",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC001"
    }
  ]
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "name": "entered to the \u003curl\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "hover over Live Score Button",
  "keyword": "And "
});
formatter.step({
  "name": "click on Live Scores Home button",
  "keyword": "Then "
});
formatter.step({
  "name": "click the Cricket Schedule button",
  "keyword": "And "
});
formatter.step({
  "name": "check todays all links are working",
  "keyword": "Then "
});
formatter.step({
  "name": "the response code is \u003crcode\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "assert all link validations \u003crcode\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "url",
        "rcode"
      ]
    },
    {
      "cells": [
        "https://www.espncricinfo.com",
        "200"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Check Current Date Links errors",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC001"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "entered to the https://www.espncricinfo.com",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.enteredToThe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hover over Live Score Button",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.hoverOverLiveScoreButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Live Scores Home button",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.clickOnLiveScoresHomeButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the Cricket Schedule button",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.clickTheCricketScheduleButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check todays all links are working",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.checkTodaysAllLinksAreWorking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response code is 200",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.theResponseCodeIs(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "assert all link validations 200",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.assertAllLinkValidations(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.closeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});