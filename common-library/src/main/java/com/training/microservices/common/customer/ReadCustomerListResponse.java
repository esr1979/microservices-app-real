package com.training.microservices.common.customer;

import lombok.Data;

import java.util.List;

@Data
public class ReadCustomerListResponse {
    private List<ReadCustomerResponse> customers;
}
