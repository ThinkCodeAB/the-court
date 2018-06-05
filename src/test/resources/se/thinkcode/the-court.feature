Feature: Buy food and beverages at The Court

  The restaurant chain The Court serves a mix of European and Asian food.
  Customers swipe a smart card when they get their food and beverages.
  The customers credit card is debited monthly.

  Scenario: A guest buys lunch and get debited
    Given Sarah orders a meal for £9
    When Sarah swipes her card
    Then should Sarahs account get debited £9

  Scenario: A couple orders two dishes
    Given Sarah orders a dish for £14
    And Charles orders a dish for £9
    When Sarah swipes her card
    Then should Sarahs account get debited £23

  Scenario: A family orders lunch
    Given Sarah orders a dish for £20
    And Charles orders a dish for £20
    And Anna orders a dish for £20
    And Walther orders a dish for £20
    When Sarah swipes her card
    Then should Sarahs account get debited £72

  Scenario: A guest should get a discount if she buys for £50
    Given Sarah orders a dish for £50
    When Sarah swipes her card
    Then should Sarahs account get debited £45

  Scenario: A guest should not get a discount if she buys for £49
    Given Sarah orders a dish for £49
    When Sarah swipes her card
    Then should Sarahs account get debited £49

