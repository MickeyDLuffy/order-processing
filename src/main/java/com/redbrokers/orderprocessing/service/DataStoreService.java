package com.redbrokers.orderprocessing.service;

import com.redbrokers.orderprocessing.dto.OrderBookDto;
import com.redbrokers.orderprocessing.dto.Side;
import com.redbrokers.orderprocessing.enums.Exchange;

import java.util.List;
import java.util.Map;

public interface DataStoreService {
     void storeDataFromRedis(Map<Exchange, Map<Side, Map<String, List<OrderBookDto>>>> data) ;
     Map<Exchange, Map<Side, Map<String, List<OrderBookDto>>>> getDataFromRedis() ;
}
