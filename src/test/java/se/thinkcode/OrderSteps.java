package se.thinkcode;

import cucumber.api.java.en.Given;

import java.util.List;

public class OrderSteps {
    private World world;

    public OrderSteps(World world) {
        this.world = world;
    }

    @Given("Sarah/Charles/Anna/Walther orders a dish/meal for £{int}")
    public void ordered_a_meal_for_(Integer price) {
        world.currentTab += price;
    }

    @Given("meal orders")
    public void meal_orders(List<Order> orders) {
        for (Order order : orders) {
            world.currentTab += order.getPrice();
        }
    }
}
