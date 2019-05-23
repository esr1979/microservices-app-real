package com.training.microservices.common.catalog;

import lombok.Data;

@Data
public class ReadProductResponse {
    private String id;
    private String title;
    private String description;

}
