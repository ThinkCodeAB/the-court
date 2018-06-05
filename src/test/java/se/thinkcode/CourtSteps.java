package se.thinkcode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CourtSteps {
    private TheCourt court = new TheCourt();
    private Integer currentTab = 0;

    @Given("Sarah/Charles/Anna/Walther orders a dish/meal for £{int}")
    public void ordered_a_meal_for_(Integer price) {
        currentTab += price;
    }

    @Given("meal orders")
    public void meal_orders(List<Order> orders) {
        for (Order order : orders) {
            currentTab += order.getPrice();
        }
    }

    @When("{word} swipes her card")
    public void she_swipes_her_card(String guest) {
        court.swipe(guest, currentTab);
    }

    @Then("should {word}s account get debited £{int}")
    public void should_her_account_get_debited_(String guest, Integer expectedBalance) {
        assertThat(court.getBalance(guest), is(expectedBalance));
    }
}
