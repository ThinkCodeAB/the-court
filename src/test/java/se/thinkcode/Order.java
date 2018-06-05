package se.thinkcode;

public class Order {
    private String name;
    private Integer price;

    public Order(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }
}
