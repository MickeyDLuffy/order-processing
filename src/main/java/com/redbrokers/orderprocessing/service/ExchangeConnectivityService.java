package com.redbrokers.orderprocessing.service;

import com.redbrokers.orderprocessing.dto.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface ExchangeConnectivityService {
    ResponseEntity<?> buyStock(Order order);
    ResponseEntity<?> sellStock(Order order);
}
