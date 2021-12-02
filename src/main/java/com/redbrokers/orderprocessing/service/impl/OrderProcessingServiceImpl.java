package com.redbrokers.orderprocessing.service.impl;

import com.redbrokers.orderprocessing.service.OrderProcessingService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OrderProcessingServiceImpl implements OrderProcessingService {


    @Override
    public ResponseEntity<Void> getDataFromRedisQueue() {
        return null;
    }


}
