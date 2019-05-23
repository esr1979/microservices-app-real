package com.training.microservices.common.customer;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AddCreditCustomerRequest {
    private BigDecimal creditToAdd;
}
