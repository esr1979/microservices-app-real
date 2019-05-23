package com.training.microservices.common.shipment;

import lombok.Data;

import java.util.List;

@Data
public class ReadShipmentListResponse {
    private List<ReadShipmentResponse> shipments;
}
