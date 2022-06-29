package com.example.fraud;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/fraud-check")
@RequiredArgsConstructor
@Slf4j
public class FraudContoller {

    private final FraudCheckHistoryService fraudCheckHistoryService;

    public FraudCheckRespone isFraudster(@PathVariable("customerId") Integer customerId) {
        boolean fraudulentCustomer = fraudCheckHistoryService.isFraudulentCustomer(customerId);
        log.info("fraud check request for customer {}", customerId);
        return new FraudCheckRespone(fraudulentCustomer);
    }
}

