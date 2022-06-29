package com.example.customer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public void registerCustomer(@RequestBody CustomerReqisterRequest customerReqisterRequest) {
        log.info("new customer registration {}", customerReqisterRequest);
        customerService.registerCustomer(customerReqisterRequest);
    }
}
