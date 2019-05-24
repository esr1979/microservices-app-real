package com.training.microservices.deliverymanservice.service;

import com.training.microservices.common.deliveryMan.HireDeliveryManResponse;
import org.springframework.stereotype.Component;

@Component
public class HireNewDeliveryManIMP implements HireNewDeliveryManIFC {

    @Override
    public HireDeliveryManResponse HireNewDeliveryMan(){

        HireDeliveryManResponse response = new HireDeliveryManResponse();
        response.setId("Id created");
        return response;


    }
}
