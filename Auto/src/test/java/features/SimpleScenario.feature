
Feature: QA Engineer Pre-assessment

	@web
  Scenario: Validate until Payment Screen
      Given I open a browser
      When User chooses to country Options
      Then User search for a product
      And User add the product to ADD Cart
      And Verify the product in ADD Cart
      Then User click Checkout Button
      And User login as Guest
      Then User enter contact information
      And User enter the Payment details and card number
      And verify the Success Message