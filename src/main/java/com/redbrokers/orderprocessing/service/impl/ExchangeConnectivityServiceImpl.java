package com.redbrokers.orderprocessing.service.impl;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.redbrokers.orderprocessing.dto.ErrorFromExchange;
import com.redbrokers.orderprocessing.dto.FullOrderBook;
import com.redbrokers.orderprocessing.dto.Order;
import com.redbrokers.orderprocessing.service.ExchangeConnectivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.ParameterizedType;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ExchangeConnectivityServiceImpl implements ExchangeConnectivityService {
    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper = new ObjectMapper();
    @Value("${order-processing.variables.urls.exchange-service}")
    private String exchangeServiceUrl;

    @Override
    public ResponseEntity<?> buyStock(Order order) {
        return null;
    }

    @Override
    public ResponseEntity<?> sellStock(Order order) {
        return null;
    }

    @Override
    public ResponseEntity<?> getOrderBooks() {

        var response = restTemplate.exchange(exchangeServiceUrl, HttpMethod.GET,
                null, new ParameterizedTypeReference<List<FullOrderBook>>() {  });
        if(response.getStatusCode().is2xxSuccessful()) {
            return new ResponseEntity<>(response.getBody(), HttpStatus.OK);
        }


        return new ResponseEntity<>(response.getBody(), HttpStatus.INTERNAL_SERVER_ERROR);


    }

    @Override
    public ResponseEntity<?> getOrderBooksByTicker() {
        return null;
    }

    @Override
    public ResponseEntity<?> getOrderBooksByTickerBought() {
        return null;
    }

    @Override
    public ResponseEntity<?> getOrderBooksByTickerSold() {
        return null;
    }

    @Override
    public ResponseEntity<?> getOrderBooksTickerOpen() {
        return null;
    }

    @Override
    public ResponseEntity<?> getOrderBookTickerClosed() {
        return null;
    }

    @Override
    public ResponseEntity<?> getOrderBookTickerCancelled() {
        return null;
    }


}
