$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/AmzonSeachFunctionality.feature");
formatter.feature({
  "name": "Login to Amazon Mobile App, Search an Item and Buy",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launch Amazon Mobile App and select on \"Already a customer? Sign in\" Already a customer? Sign in Option",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Amazon_Mobile_App_and_select_on_Already_a_customer_Sign_in_Option(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter the Email as \"manjunathqa21@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Enter_the_Email_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"Continue\" Continue button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_clicks_on_Continue_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter Password as \"ManjuQA@21\" and clicks on \"Sign In\" Sign In Button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Enter_Password_as_and_clicks_on_Sign_In_Button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is Landed to Amazon Home page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_is_Landed_to_Amazon_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Entered the search as \"65-inch TV\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Entered_the_search_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select the Items Randomly",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_should_select_the_Items_Randomly()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should able to buy the selected Item",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_should_able_to_buy_the_selected_Item()"
});
formatter.result({
  "status": "passed"
});
});