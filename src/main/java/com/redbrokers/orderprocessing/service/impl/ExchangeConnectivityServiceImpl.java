package com.redbrokers.orderprocessing.service.impl;

import com.redbrokers.orderprocessing.dto.Order;
import com.redbrokers.orderprocessing.service.ExchangeConnectivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExchangeConnectivityServiceImpl implements ExchangeConnectivityService {
    @Override
    public ResponseEntity<?> buyStock(Order order) {
        return null;
    }

    @Override
    public ResponseEntity<?> sellStock(Order order) {
        return null;
    }
}
