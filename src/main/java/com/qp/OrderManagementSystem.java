package com.qp;

import com.qp.model.Customer;
import com.qp.model.Order;

public class OrderManagementSystem {

    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", CustomerTypeEnum.VIP);
        Order order = new Order(customer);
        order.addItem("Laptop", 1000);
        order.addItem("Mouse", 50);
        order.addItem("Keyboard", 80);
        order.printOrder();
        generateInvoice(order);
    }

    private static void generateInvoice(Order order) {
        System.out.println("Generating Invoice...");
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Total: $" + order.calculateTotal());
        System.out.println("Discounted Total: $" + order.calculateTotal());
        System.out.println("Items: " + order.getItems());
        System.out.println("Thank you for shopping with us!");
    }
}
