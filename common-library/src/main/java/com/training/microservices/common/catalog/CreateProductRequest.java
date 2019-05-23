package com.training.microservices.common.catalog;

import lombok.Data;

@Data
public class CreateProductRequest {

    private String title;
    private String description;

}