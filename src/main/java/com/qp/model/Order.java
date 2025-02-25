package com.qp.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private List<String> items;
    private List<Double> prices;

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
        System.out.println("Total Price: " + calculateTotal());
        System.out.println("Discounted Price: " + applyDiscount(calculateTotal()));
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<String> getItems() {
        return items;
    }
}