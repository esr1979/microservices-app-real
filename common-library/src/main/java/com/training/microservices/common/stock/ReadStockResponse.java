package com.training.microservices.common.stock;

import lombok.Data;

@Data
public class ReadStockResponse {
    private String productId;
    private long stock;
}
