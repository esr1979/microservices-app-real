package com.training.microservices.common.deliveryMan;

import lombok.Data;

@Data
public class UpdateDeliveryManRequest {
    private String id;
    private String name;
    private String shipmentId;
}
