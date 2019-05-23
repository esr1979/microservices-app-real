package com.training.microservices.common.order;

import lombok.Data;

import java.util.List;

@Data
public class ReadOrderListResponse {
    private List<ReadOrderResponse> orders;
}
