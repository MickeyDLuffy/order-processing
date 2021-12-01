package com.redbrokers.orderprocessing.service;
@FunctionalInterface
public interface MessagePublisher {
    void publish(final String message);
}
