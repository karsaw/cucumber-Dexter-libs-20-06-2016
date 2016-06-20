$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchProduct.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: karansawhney1991@gmail.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary : Sample Cucumber Project for training purpose"
    }
  ],
  "line": 3,
  "name": "Search Products on E-commerce platform.",
  "description": "",
  "id": "search-products-on-e-commerce-platform.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Search Samsung Galaxy S7 on flipkart",
  "description": "",
  "id": "search-products-on-e-commerce-platform.;search-samsung-galaxy-s7-on-flipkart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User is on Flipkart home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter product name in search bar",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks on search button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is displayed all the products which matches search result",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user selects white product.",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps.user_is_on_Flipkart_home_page()"
});
formatter.result({
  "duration": 16960847066,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_enter_product_name_in_search_bar()"
});
formatter.result({
  "duration": 682974396,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_clicks_on_search_button()"
});
formatter.result({
  "duration": 9593111195,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_is_displayed_all_the_products_which_matches_search_result()"
});
formatter.result({
  "duration": 1187498988,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_selects_white_product()"
});
formatter.result({
  "duration": 343623157,
  "status": "passed"
});
});