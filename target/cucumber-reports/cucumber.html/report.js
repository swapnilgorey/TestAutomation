$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestCases.feature");
formatter.feature({
  "line": 1,
  "name": "Youtube Search Validation",
  "description": "",
  "id": "youtube-search-validation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Search a video on Youtube with given text",
  "description": "",
  "id": "youtube-search-validation;search-a-video-on-youtube-with-given-text",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User launches Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Launches youtube website",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "Enters text in Search Field \"Swapnil Gorey\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Related Videos should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Quit browser Session",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCasesStepDef.openBrowser()"
});
formatter.result({
  "duration": 4184100474,
  "status": "passed"
});
formatter.match({
  "location": "TestCasesStepDef.launchYoutube()"
});
formatter.result({
  "duration": 127803776,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Swapnil Gorey",
      "offset": 29
    }
  ],
  "location": "TestCasesStepDef.searchVideo(String)"
});
formatter.result({
  "duration": 488383618,
  "status": "passed"
});
formatter.match({
  "location": "TestCasesStepDef.verifyVideo()"
});
formatter.result({
  "duration": 12132462135,
  "status": "passed"
});
formatter.match({
  "location": "TestCasesStepDef.tearDown()"
});
formatter.result({
  "duration": 1116868429,
  "status": "passed"
});
});