package com.redbrokers.orderprocessing.service.redis;
@FunctionalInterface
public interface MessagePublisher {
    void publish(final String message);
}
