package com.redbrokers.orderprocessing.service.impl;

import com.redbrokers.orderprocessing.dto.Order;
import com.redbrokers.orderprocessing.dto.Side;
import com.redbrokers.orderprocessing.service.DataStoreService;
import com.redbrokers.orderprocessing.service.ExchangeConnectivityService;
import com.redbrokers.orderprocessing.service.MultiLegService;
import com.redbrokers.orderprocessing.service.OrderProcessingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class OrderProcessingServiceImpl implements OrderProcessingService {
    private final DataStoreService dataStoreService;
    private final ExchangeConnectivityService exchangeService;
    @Override
    public ResponseEntity<?> getDataFromRedisQueue(Order order) {

        return new ResponseEntity<>(dataStoreService.getDataFromRedis(), HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<?> processOrder(Order order) {
        if(order.getSide() == Side.BUY) {
            return new ResponseEntity<>(exchangeService.buyStock(order), HttpStatus.ACCEPTED);
        } else if (order.getSide() == Side.SELL){
            return new ResponseEntity<>(exchangeService.sellStock(order), HttpStatus.ACCEPTED);
        }

        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "The Side must be either a BUY or SELL");
    }


}
