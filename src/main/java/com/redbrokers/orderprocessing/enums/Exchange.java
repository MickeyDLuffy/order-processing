package com.redbrokers.orderprocessing.enums;

public enum Exchange {
    ONE("exchange-one"),
    TWO("exchange-two");

    private String name;

    Exchange(String name) {
        this.name = name;
    }
}
