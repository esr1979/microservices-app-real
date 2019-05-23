package com.training.microservices.common.stock;

import lombok.Data;

@Data
public class AddStockRequest {
    private long stockToAdd;
}
