package com.qp.model;

import com.qp.CustomerTypeEnum;

public class Customer {
    private String name;
    private CustomerTypeEnum type; // "Regular", "Premium", "VIP"
    private double discount;

    public Customer(String name, CustomerTypeEnum type) {
        this.name = name;
        this.type = type;

    }

    public String getName() {
        return name;
    }


    public double getDiscount() {
        switch (type) {
            case REGULAR:
                discount = CustomerTypeEnum.REGULAR.getDiscount();
                break;
            case PREMIUM:
                discount = CustomerTypeEnum.PREMIUM.getDiscount();
                break;
            case VIP:
                discount = CustomerTypeEnum.VIP.getDiscount();
                break;
        }

        return discount;
    }
}

