package com.training.microservices.common.customer;

import lombok.Data;

@Data
public class CreateCustomerRequest {

    private String name;
    private String initialCredit;

}