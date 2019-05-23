package com.training.microservices.common.stock;

import lombok.Data;

import java.util.List;

@Data
public class ReadStockListResponse {
    private List<ReadStockResponse> stocks;
}
