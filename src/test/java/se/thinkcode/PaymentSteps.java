package se.thinkcode;

import cucumber.api.java.en.When;

public class PaymentSteps {
    private World world;

    public PaymentSteps(World world) {
        this.world = world;
    }

    @When("{word} swipes her card")
    public void she_swipes_her_card(String guest) {
        world.court.swipe(guest, world.currentTab);
    }
}
