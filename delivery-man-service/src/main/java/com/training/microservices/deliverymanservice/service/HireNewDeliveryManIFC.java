package com.training.microservices.deliverymanservice.service;

import com.training.microservices.common.deliveryMan.HireDeliveryManRequest;
import com.training.microservices.common.deliveryMan.HireDeliveryManResponse;
import com.training.microservices.common.deliveryMan.ReadDeliveryManListResponse;
import com.training.microservices.common.deliveryMan.ReadDeliveryManResponse;

public interface HireNewDeliveryManIFC {

    public HireDeliveryManResponse HireNewDeliveryMan (HireDeliveryManRequest hireDeliveryManRequest);
    public ReadDeliveryManResponse ReadDeliveryMan(String id);
    public ReadDeliveryManListResponse ReadDeliveryMenList();

}
