package com.training.microservices.common.customer;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ReadCustomerResponse {
    private String id;
    private String name;
    private BigDecimal credit;

}
