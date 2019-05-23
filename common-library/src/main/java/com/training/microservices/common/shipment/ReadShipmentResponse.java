package com.training.microservices.common.shipment;

import lombok.Data;

@Data
public class ReadShipmentResponse {
    private String id;
    private String status;
    private String deliveryManId;

}
