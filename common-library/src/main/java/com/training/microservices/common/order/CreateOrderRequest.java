package com.training.microservices.common.order;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateOrderRequest {

    private String productId;
    private String customerId;
    private BigDecimal price;

}