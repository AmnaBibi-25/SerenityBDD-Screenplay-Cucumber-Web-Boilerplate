Feature: Purchase an item from Sauce demo
  Scenario Outline: Successful Checkout flow

    Given user is on products listing page
    When user selects the products using <parameters> and move them to cart
    And user verifies the cart
    And user fills personal information and user verifies the overview page
    Then user should be able to see Thank you message

    @checkout-test-suite
    Examples:
    | parameters |
    | Checkout Parameters |

