package com.training.microservices.common.order;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ReadOrderResponse {
    private String id;
    private String productId;
    private String customerId;
    private BigDecimal price;
    private String status;
}
