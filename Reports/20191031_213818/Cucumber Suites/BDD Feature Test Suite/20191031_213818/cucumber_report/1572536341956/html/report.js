$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("G:/Katalon Studio/Katalon Workspace/Behaviour Driven Devlopment Example Project Using Cucumber Environment/Include/features/BDD Feature/UserLogin.feature");
formatter.feature({
  "name": "User Login Validation Fearture",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Test User Login With Valid Credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am Navigated To User Login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User Enters Their Crerdentials, \u003cUser_Name\u003e And \u003cPassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Click On Login Button",
  "keyword": "And "
});
formatter.step({
  "name": "User Lands On Dashboard",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "User_Name",
        "Password"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Test User Login With Valid Credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am Navigated To User Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "ValidUserLoginSteps.navigateToLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enters Their Crerdentials, Admin And admin123",
  "keyword": "When "
});
formatter.match({
  "location": "ValidUserLoginSteps.loginCredentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "ValidUserLoginSteps.loginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Lands On Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidUserLoginSteps.verifyDashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test User Login With Valid Credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am Navigated To User Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "ValidUserLoginSteps.navigateToLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enters Their Crerdentials, Admin And admin123",
  "keyword": "When "
});
formatter.match({
  "location": "ValidUserLoginSteps.loginCredentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click On Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "ValidUserLoginSteps.loginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Lands On Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidUserLoginSteps.verifyDashboard()"
});
formatter.result({
  "status": "passed"
});
});