package com.training.microservices.common.catalog;

import lombok.Data;

import java.util.List;

@Data
public class ReadProductListResponse {
    private List<ReadProductResponse> products;
}
