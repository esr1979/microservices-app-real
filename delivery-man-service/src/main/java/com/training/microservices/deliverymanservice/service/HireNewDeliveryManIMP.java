package com.training.microservices.deliverymanservice.service;

import com.training.microservices.common.deliveryMan.*;
import com.training.microservices.common.utils.IdGenerator;
import com.training.microservices.deliverymanservice.persistence.model.DeliveryMan;
import com.training.microservices.deliverymanservice.persistence.repository.DeliveryManRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class HireNewDeliveryManIMP implements HireNewDeliveryManIFC {

    @Autowired
    DeliveryManRepository deliveryManRepository;

    @Override
    public DeliveryMan HireNewDeliveryMan(HireDeliveryManRequest hireDeliveryManRequest){
        DeliveryMan createdMan;
        DeliveryMan deliveryMan = new DeliveryMan();
        deliveryMan.setId(IdGenerator.generateId());
        deliveryMan.setName(hireDeliveryManRequest.getName());
        createdMan = deliveryManRepository.save(deliveryMan);
        return createdMan;

    }

    @Override
    public Optional<DeliveryMan> ReadDeliveryMan(String id){
        Optional<DeliveryMan> readMan;
        readMan = deliveryManRepository.findById(id);
        return readMan;
    }

    @Override
    public Iterable<DeliveryMan>  ReadDeliveryMenList(){
        Iterable<DeliveryMan> readMenList;
        readMenList = deliveryManRepository.findAll();
        return readMenList;
    }

    @Override
    public void DeleteDeliveryMan(String id){

        deliveryManRepository.deleteById(id);

    }

    @Override
    public DeliveryMan UpdateDeliveryMan(UpdateDeliveryManRequest updateDeliveryManRequest){

        DeliveryMan updatedMan;
        DeliveryMan deliveryMan = new DeliveryMan();
        deliveryMan.setId(updateDeliveryManRequest.getId());
        deliveryMan.setName(updateDeliveryManRequest.getName());
        deliveryMan.setShipmentNumber(updateDeliveryManRequest.getShipmentId());
        updatedMan = deliveryManRepository.save(deliveryMan);
        return updatedMan;

    }



}
