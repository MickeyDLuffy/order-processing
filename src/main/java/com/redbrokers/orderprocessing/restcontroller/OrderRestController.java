package com.redbrokers.orderprocessing.restcontroller;

import com.redbrokers.orderprocessing.dto.Order;
import com.redbrokers.orderprocessing.service.OrderProcessingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/orders")
public class OrderRestController {

    private final OrderProcessingService orderProcessingService;

    @GetMapping("/")
    public ResponseEntity<?> process() {
        return ResponseEntity.created(URI.create("")).body("");
    }


    @PostMapping("/d")
    public ResponseEntity<?> processOrder(@RequestBody Order order) {
        return orderProcessingService.getDataFromRedisQueue(order);
    }
}
