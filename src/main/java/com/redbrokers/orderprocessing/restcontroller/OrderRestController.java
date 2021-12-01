package com.redbrokers.orderprocessing.restcontroller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/order")
public class OrderRestController {

    @GetMapping("/")
    public ResponseEntity<?> process() {
        return ResponseEntity.created(URI.create("")).body("");
    }
}
