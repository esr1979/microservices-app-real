package com.training.microservices.deliverymanservice.controller;

import com.training.microservices.common.deliveryMan.HireDeliveryManRequest;
import com.training.microservices.deliverymanservice.service.HireNewDeliveryManIFC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.PreUpdate;

@RestController
@RequestMapping(path="/api/v1")
public class DeliveryManController {

    @Autowired
    HireNewDeliveryManIFC hireNewDeliveryManIFC;

    public DeliveryManController (HireNewDeliveryManIFC hireNewDeliveryManIFC){
        this.hireNewDeliveryManIFC = hireNewDeliveryManIFC;
    }

    @PostMapping(path="/hiredeliveryman")
    public String hireDeliveryMan (@RequestBody HireDeliveryManRequest hireDeliveryManRequest) {
        return hireNewDeliveryManIFC.HireNewDeliveryMan();
    }

}
