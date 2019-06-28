package com.training.microservices.common.deliveryMan;

import lombok.Builder;
import lombok.Data;

@Data
public class UpdateDeliveryManResponse {
    private String id;
    private String name;
    private String shipmentId;

}
