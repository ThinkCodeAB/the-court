Feature: Buy food and beverages at The Court

  The restaurant chain The Court serves a mix of European and Asian food.
  Customers swipe a smart card when they get their food and beverages.
  The customers credit card is debited monthly.

  Background: A background will be executed before each scenario in the current feature file
    Given a common setup

  Scenario: A couple orders two dishes
    Given Sarah orders a dish for £14
    And Charles orders a dish for £9
    When Sarah swipes her card
    Then should Sarahs account get debited £23

  Scenario: A family orders lunch
    Given meal orders
      | name    | price |
      | Sarah   | 20    |
      | Charles | 20    |
      | Anna    | 20    |
      | Walther | 20    |
    When Sarah swipes her card
    Then should Sarahs account get debited £72

  Scenario Outline: Big spenders get 10% discount
    Given <name> orders a dish for £<price>
    When <name> swipes her card
    Then should <name>s account get debited £<cost>

    Examples:
      | name  | price | cost |
      | Sarah | 50    | 45   |
      | Sarah | 49    | 49   |
