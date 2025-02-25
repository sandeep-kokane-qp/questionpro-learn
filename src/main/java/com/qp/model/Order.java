package com.qp.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final Customer customer;
    private final List<String> items;
    private final List<Double> prices;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
        this.prices = new ArrayList<>();
    }

    public void addItem(String item, double price) {
        items.add(item);
        prices.add(price);
    }

    public double calculateTotal() {
        double totalPrice = 0;
        for (double price : prices) {
            totalPrice += price;
        }
        return totalPrice;
    }

    public double applyDiscount(double totalPrice) {
        return totalPrice - (totalPrice * customer.getDiscount());
    }

    public void printOrder() {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Items: " + items);
        double totalAmount = calculateTotal();
        System.out.println("Total Price: " + totalAmount);
        System.out.println("Discounted Price: " + applyDiscount(totalAmount));
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<String> getItems() {
        return items;
    }
}