package com.training.microservices.common.deliveryMan;

import lombok.Data;

import java.util.List;

@Data
public class ReadDeliveryManListResponse {
    private List<ReadDeliveryManResponse> deliveryMen;
}
