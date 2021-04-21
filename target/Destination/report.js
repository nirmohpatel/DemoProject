$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/HomeInsurance.feature");
formatter.feature({
  "line": 2,
  "name": "User is successfully get Home insurance quotation",
  "description": "",
  "id": "user-is-successfully-get-home-insurance-quotation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.before({
  "duration": 6597833600,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Morethan Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepDefs.i_am_on_Morethan_Home_Page()"
});
formatter.result({
  "duration": 4989416500,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "I should be able to verify all our products",
  "description": "",
  "id": "user-is-successfully-get-home-insurance-quotation;i-should-be-able-to-verify-all-our-products",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I click on Home",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepDefs.i_click_on_Home()"
});
formatter.result({
  "duration": 148800,
  "status": "passed"
});
formatter.after({
  "duration": 29000,
  "status": "passed"
});
});