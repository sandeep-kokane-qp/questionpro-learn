package com.qp;

public enum CustomerTypeEnum {
    REGULAR("Regular", 0.05),
    PREMIUM("Premium", 0.1),
    VIP("VIP", 0.2);

    private String name;
    private double discount;

    CustomerTypeEnum(String name, double discountAmount) {
        this.name = name;
        this.discount = discountAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
