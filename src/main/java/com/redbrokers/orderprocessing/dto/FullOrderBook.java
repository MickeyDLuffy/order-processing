package com.redbrokers.orderprocessing.dto;

import lombok.Data;

import java.util.List;

@Data
public class FullOrderBook {
    private Ticker product;
    private int quantity;
    private double price;
    private Side side;
    private List<Execution> executions;
    private int cumulativeQuantity;
}