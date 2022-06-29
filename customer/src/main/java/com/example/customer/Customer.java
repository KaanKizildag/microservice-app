package com.example.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @SequenceGenerator(name = "seq_customer_id",
            sequenceName = "seq_customer_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "seq_customer_id")
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
