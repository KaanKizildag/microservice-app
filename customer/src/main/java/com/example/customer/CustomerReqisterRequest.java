package com.example.customer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerReqisterRequest {
    String firstName;
    String lastName;
    String email;
}
