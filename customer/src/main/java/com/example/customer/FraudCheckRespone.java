package com.example.customer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FraudCheckRespone {
    private Boolean isFraudster;
}
