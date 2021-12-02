package com.redbrokers.orderprocessing.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface OrderProcessingService {

    ResponseEntity<Void> getDataFromRedisQueue();

}
