package com.training.microservices.deliverymanservice.service;

import com.training.microservices.common.deliveryMan.HireDeliveryManResponse;
import com.training.microservices.common.deliveryMan.ReadDeliveryManListResponse;
import com.training.microservices.common.deliveryMan.ReadDeliveryManResponse;
import lombok.Builder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HireNewDeliveryManIMP implements HireNewDeliveryManIFC {

    @Override
    public HireDeliveryManResponse HireNewDeliveryMan(){
        HireDeliveryManResponse response = new HireDeliveryManResponse();
        response.setId("ManId");
        return response;
    }

    @Override
    public ReadDeliveryManResponse ReadDeliveryMan(){
        ReadDeliveryManResponse response = new ReadDeliveryManResponse();
        response.setId("1");
        response.setName("Man 1");
        response.setShipmentId("Ship 1");
        return response;
    }

    @Override
    public ReadDeliveryManListResponse ReadDeliveryMenList(){
        ReadDeliveryManListResponse response = new ReadDeliveryManListResponse();

        List<ReadDeliveryManResponse> deliveryMenList = new ArrayList<>();

        ReadDeliveryManResponse responseMan1 = new ReadDeliveryManResponse();
        responseMan1.setId("1");
        responseMan1.setName("Man 1");
        responseMan1.setShipmentId("Ship 1");
        ReadDeliveryManResponse responseMan2 = new ReadDeliveryManResponse();
        responseMan2.setId("2");
        responseMan2.setName("Man 2");
        responseMan2.setShipmentId("Ship 2");

        deliveryMenList.add(responseMan1);
        deliveryMenList.add(responseMan2);

        response.setDeliveryMen(deliveryMenList);

        return response;

    }

}
