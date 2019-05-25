package com.training.microservices.deliverymanservice.service;

import com.training.microservices.common.deliveryMan.HireDeliveryManResponse;
import com.training.microservices.common.deliveryMan.ReadDeliveryManListResponse;
import com.training.microservices.common.deliveryMan.ReadDeliveryManResponse;

public interface HireNewDeliveryManIFC {

    public HireDeliveryManResponse HireNewDeliveryMan ();
    public ReadDeliveryManResponse ReadDeliveryMan();
    public ReadDeliveryManListResponse ReadDeliveryMenList();

}
