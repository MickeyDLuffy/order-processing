package com.redbrokers.orderprocessing.service.redis;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.redbrokers.orderprocessing.dto.OrderBookDto;
import com.redbrokers.orderprocessing.dto.OrderProcessObject;
import com.redbrokers.orderprocessing.dto.Side;
import com.redbrokers.orderprocessing.enums.Exchange;
import com.redbrokers.orderprocessing.service.DataStoreService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
@RequiredArgsConstructor
public class RedisMessageSubscriber implements MessageListener {
    private final DataStoreService  dataStoreService;
    @Override
    public void onMessage(Message message, byte[] pattern) {
        ObjectMapper objectMapper = new ObjectMapper();
//        dataStoreService.storeDataFromRedis("I am from redis");

        Map<Exchange, Map<Side, Map<String, List<OrderBookDto>>>> orderbooks = null;
        try {
            TypeReference<Map<Exchange, Map<Side, Map<String, List<OrderBookDto>>>>> typeRef
                    = new TypeReference<>() {};
            orderbooks = objectMapper.readValue(message.getBody(), typeRef);
            var e2 = orderbooks.get(Exchange.TWO);
           dataStoreService.storeDataFromRedis(orderbooks);
        } catch (IOException e) {
            e.printStackTrace();
        }

        log.info("Loggn the data {}", orderbooks);
    }
}
