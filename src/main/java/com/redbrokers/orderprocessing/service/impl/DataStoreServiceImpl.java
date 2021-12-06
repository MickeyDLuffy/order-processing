package com.redbrokers.orderprocessing.service.impl;

import com.redbrokers.orderprocessing.dto.OrderBookDto;
import com.redbrokers.orderprocessing.dto.Side;
import com.redbrokers.orderprocessing.enums.Exchange;
import com.redbrokers.orderprocessing.service.DataStoreService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DataStoreServiceImpl implements DataStoreService {
    private Map<Exchange, Map<Side, Map<String, List<OrderBookDto>>>> store;

    @Override
    public void storeDataFromRedis(Map<Exchange, Map<Side, Map<String, List<OrderBookDto>>>> data) {
      this.store = data;
    }

    @Override
    public Map<Exchange, Map<Side, Map<String, List<OrderBookDto>>>> getDataFromRedis() {
        return this.store;
    }
}
