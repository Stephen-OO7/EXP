$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/Login.feature");
formatter.feature({
  "name": "login functionality.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenario({
  "name": "user login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "user logs in.",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionFiles.Login.user_logs_in()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFiles/QuickSearch.feature");
formatter.feature({
  "name": "Check Quicksearch Form",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Quicksearch"
    }
  ]
});
formatter.background({
  "name": "user is logged in.",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on quicksearch form.",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionFiles.QuickSearchDef.user_is_on_quicksearch_form()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check searching with US classification class",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Quicksearch"
    },
    {
      "name": "@Quicksearch"
    },
    {
      "name": "@Clases"
    }
  ]
});
formatter.step({
  "name": "user selects US classification  field from dropdown and enters \"15/100\" in the textbox.",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionFiles.QuickSearchDef.user_selects_US_classification_field_from_dropdown_and_enters_in_the_textbox(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.xpath: //input[@id\u003d\u0027textClass_0\u0027] (tried for 60 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:82)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat PageObjects.QuickSearchObjects.enterDataInTextboxQuicksearch(QuickSearchObjects.java:126)\r\n\tat StepDefinitionFiles.QuickSearchDef.user_selects_US_classification_field_from_dropdown_and_enters_in_the_textbox(QuickSearchDef.java:325)\r\n\tat ✽.user selects US classification  field from dropdown and enters \"15/100\" in the textbox.(file:///E:/Automation_softwares%20_and_jar_files/eclipsee/PatseerExplorer/src/test/resources/FeatureFiles/QuickSearch.feature:135)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.xpath: //input[@id\u003d\u0027textClass_0\u0027]\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.10.0\u0027, revision: \u0027176b4a9\u0027, time: \u00272018-03-02T19:03:16.397Z\u0027\nSystem info: host: \u0027NEO77\u0027, ip: \u0027192.168.1.71\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:896)\r\n\tat java.util.Optional.orElseThrow(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:206)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:202)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\r\n\tat PageObjects.QuickSearchObjects.enterDataInTextboxQuicksearch(QuickSearchObjects.java:126)\r\n\tat StepDefinitionFiles.QuickSearchDef.user_selects_US_classification_field_from_dropdown_and_enters_in_the_textbox(QuickSearchDef.java:325)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat io.cucumber.java.Invoker.invoke(Invoker.java:27)\r\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:59)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:66)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks on search button.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionFiles.QuickSearchDef.user_clicks_on_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user navigates to the results page having results based on the given input.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionFiles.QuickSearchDef.results_page_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "user is logged in.",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on quicksearch form.",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionFiles.QuickSearchDef.user_is_on_quicksearch_form()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check searching with All classification class",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Quicksearch"
    },
    {
      "name": "@Quicksearch"
    },
    {
      "name": "@Clases"
    }
  ]
});
formatter.step({
  "name": "user selects All classification field from dropdown and enters \"F16D*\" in the textbox.",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionFiles.QuickSearchDef.user_selects_All_classification_field_from_dropdown_and_enters_in_the_textbox(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on search button.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionFiles.QuickSearchDef.user_clicks_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to the results page having results based on the given input.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionFiles.QuickSearchDef.results_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "user is logged in.",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on quicksearch form.",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionFiles.QuickSearchDef.user_is_on_quicksearch_form()"
});
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    formatter.step({
  "name": "user clicks on search button.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionFiles.QuickSearchDef.user_clicks_on_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user navigates to the results page having results based on the given input.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionFiles.QuickSearchDef.results_page_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
