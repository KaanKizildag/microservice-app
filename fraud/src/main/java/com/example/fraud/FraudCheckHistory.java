package com.example.fraud;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class FraudCheckHistory {
    @Id
    @SequenceGenerator(name = "seq_fraud_check_history",
            sequenceName = "seq_fraud_check_history")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "seq_fraud_check_history")
    private Integer id;
    private Integer customerId;
    private Boolean isFraudster;
    private LocalDateTime createdAt;
}

