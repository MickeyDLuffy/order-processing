package com.redbrokers.orderprocessing.dto;

import lombok.Data;
import lombok.Value;

@Data
public class Order {
    private int quantity;
    private Double price;
    private Side side;
    private Ticker product;


    @Override
    public String toString() {
        return "Order{" +
                "quantity=" + quantity +
                ", price=" + price +
                ", side=" + side +
                ", product=" + product +
                '}';
    }
}
