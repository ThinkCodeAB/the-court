package se.thinkcode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CourtSteps {
    private World world;

    public CourtSteps(World world) {
        this.world = world;
    }

    @Then("should {word}s account get debited £{int}")
    public void should_her_account_get_debited_(String guest, Integer expectedBalance) {
        assertThat(world.court.getBalance(guest), is(expectedBalance));
    }
}
