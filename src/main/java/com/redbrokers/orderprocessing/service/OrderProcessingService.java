package com.redbrokers.orderprocessing.service;

import com.redbrokers.orderprocessing.dto.Order;
import com.redbrokers.orderprocessing.dto.OrderProcessObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface OrderProcessingService {

    ResponseEntity<?> getDataFromRedisQueue(Order order);

    ResponseEntity<?> processOrder(Order order);

}
