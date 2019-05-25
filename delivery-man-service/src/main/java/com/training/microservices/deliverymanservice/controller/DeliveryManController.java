package com.training.microservices.deliverymanservice.controller;

import com.training.microservices.common.deliveryMan.HireDeliveryManRequest;
import com.training.microservices.common.deliveryMan.HireDeliveryManResponse;
import com.training.microservices.common.deliveryMan.ReadDeliveryManListResponse;
import com.training.microservices.common.deliveryMan.ReadDeliveryManResponse;
import com.training.microservices.deliverymanservice.service.HireNewDeliveryManIFC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PreUpdate;

@RestController
@RequestMapping(path="/api/v1")
public class DeliveryManController {

    @Autowired
    HireNewDeliveryManIFC hireNewDeliveryManIFC;

    public DeliveryManController (HireNewDeliveryManIFC hireNewDeliveryManIFC){
        this.hireNewDeliveryManIFC = hireNewDeliveryManIFC;
    }

    @PostMapping(path="/deliveryMen")
    public HireDeliveryManResponse hireDeliveryMan (@RequestBody HireDeliveryManRequest hireDeliveryManRequest) {
        return hireNewDeliveryManIFC.HireNewDeliveryMan();
    }

    @GetMapping(path="/deliveryMen/{id}")
    public ReadDeliveryManResponse readDeliveryMan (@PathVariable String id){
        return hireNewDeliveryManIFC.ReadDeliveryMan();
    }

    @GetMapping(path="/deliveryMen")
    public ReadDeliveryManListResponse readDeliveryMenList (){
        return hireNewDeliveryManIFC.ReadDeliveryMenList();
    }


}
