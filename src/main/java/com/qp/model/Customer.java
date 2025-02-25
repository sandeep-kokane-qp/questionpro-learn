package com.qp.model;

import com.qp.CustomerTypeEnum;

public class Customer {
    private final String name;
    private final CustomerTypeEnum type; // "Regular", "Premium", "VIP"

    public Customer(String name, CustomerTypeEnum type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getDiscount() {
        double discount = 0;
        if (type == CustomerTypeEnum.REGULAR) {
            discount = CustomerTypeEnum.REGULAR.getDiscount();
        } else if (type == CustomerTypeEnum.PREMIUM) {
            discount = CustomerTypeEnum.PREMIUM.getDiscount();
        } else if (type == CustomerTypeEnum.VIP) {
            discount = CustomerTypeEnum.VIP.getDiscount();
        }
        return discount;
    }
}

