Feature: Buy food and beverages at The Court

  The restaurant chain The Court serves a mix of European and Asian food.
  Customers swipe a smart card when they get their food and beverages.
  The customers credit card is debited monthly.

  Scenario: A guest buys lunch and get debited
    Given Sarah orders a meal for £9
    When Sarah swipes her card
    Then should Sarahs account get debited £9
