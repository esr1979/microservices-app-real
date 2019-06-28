package com.training.microservices.deliverymanservice.service;

import com.training.microservices.common.deliveryMan.*;
import com.training.microservices.deliverymanservice.persistence.model.DeliveryMan;

import java.util.Optional;

public interface HireNewDeliveryManIFC {

    public DeliveryMan HireNewDeliveryMan (HireDeliveryManRequest hireDeliveryManRequest);
    public Optional<DeliveryMan> ReadDeliveryMan(String id);
    public Iterable<DeliveryMan>  ReadDeliveryMenList();
    public void DeleteDeliveryMan(String id);
    public DeliveryMan UpdateDeliveryMan(UpdateDeliveryManRequest updateDeliveryManRequest);

}
