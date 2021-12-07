package com.redbrokers.orderprocessing.restcontroller;

import com.redbrokers.orderprocessing.service.ExchangeConnectivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/orderbook")
public class OrderBookController {
    private ExchangeConnectivityService exchange;

    @GetMapping("/orderbook")
    public ResponseEntity<?> getOrderBooks(){
        return exchange.getOrderBooks();
    }

    @GetMapping("/orderbook/{product}")
    public ResponseEntity<?> getOrderBookByTicker(@PathVariable("product") String ticker){
        return exchange.getOrderBooksByTicker();
    }

    @GetMapping("/orderbook/{product}/buy")
    public ResponseEntity<?> getOrderBookByTickerBought(@PathVariable("product") String ticker){
        return exchange.getOrderBooksByTickerBought();
    }

    @GetMapping("/orderbook/{product}/sell")
    public ResponseEntity<?> getOrderBookByTickerSold(@PathVariable("product") String ticker){
        return exchange.getOrderBooksByTickerSold();
    }

    @GetMapping("/orderbook/{product}/open")
    public ResponseEntity<?> getOrderBookOpen(@PathVariable("product") String ticker){
        return exchange.getOrderBooksTickerOpen();
    }

    @GetMapping("/orderbook/{product}/closed")
    public ResponseEntity<?> getOrderBookClosed(@PathVariable("product") String ticker){
        return exchange.getOrderBookTickerClosed();
    }

    @GetMapping("/orderbook/{product}/cancelled")
    public ResponseEntity<?> getOrderBookCancelled(@PathVariable("product") String ticker){
        return exchange.getOrderBookTickerCancelled();
    }


}
