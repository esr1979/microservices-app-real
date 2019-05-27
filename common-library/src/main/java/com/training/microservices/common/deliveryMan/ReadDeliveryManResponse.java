package com.training.microservices.common.deliveryMan;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReadDeliveryManResponse {

    private String id;
    private String name;
    private String shipmentId;

}
