package com.redbrokers.orderprocessing.service.redis;

import org.springframework.data.redis.connection.Message;

@FunctionalInterface
public interface MessageListener {
     void onMessage(final Message message, final byte[] pattern) ;
}
