package com.example.datamodel;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class FraudCheckResponse {
    private Boolean isFraudster;
}
