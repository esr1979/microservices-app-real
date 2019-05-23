package com.training.microservices.common.catalog;

import lombok.Data;

import java.util.HashMap;

@Data
public class ReadProductMetricsResponse {
    private HashMap<String, HashMap<String, Integer>> metrics;
}
