package com.training.microservices.deliverymanservice.service;

import com.training.microservices.common.deliveryMan.HireDeliveryManRequest;
import com.training.microservices.common.deliveryMan.HireDeliveryManResponse;
import com.training.microservices.common.deliveryMan.ReadDeliveryManListResponse;
import com.training.microservices.common.deliveryMan.ReadDeliveryManResponse;
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
    public HireDeliveryManResponse HireNewDeliveryMan(HireDeliveryManRequest hireDeliveryManRequest){

        HireDeliveryManResponse response = new HireDeliveryManResponse();
        DeliveryMan createdMan;
        DeliveryMan deliveryMan = new DeliveryMan();
        deliveryMan.setId(IdGenerator.generateId());
        deliveryMan.setName(hireDeliveryManRequest.getName());
        createdMan = deliveryManRepository.save(deliveryMan);
        response.setId(createdMan.getId());
        return response;

    }

    @Override
    public ReadDeliveryManResponse ReadDeliveryMan(String id){
        ReadDeliveryManResponse response = new ReadDeliveryManResponse();
        Optional<DeliveryMan> readMan;
        readMan = deliveryManRepository.findById(id);

        if (readMan.isPresent()){
            response.setId(readMan.get().getId());
            response.setName(readMan.get().getName());
            response.setShipmentId(readMan.get().getShipmentNumber());
        }

        return response;
    }

    @Override
    public ReadDeliveryManListResponse ReadDeliveryMenList(){

        ReadDeliveryManListResponse response = new ReadDeliveryManListResponse();
        List<ReadDeliveryManResponse> deliveryMenList = new ArrayList<>();
        Iterable<DeliveryMan> readMenList;
        readMenList = deliveryManRepository.findAll();

        for (DeliveryMan dM : readMenList){
            ReadDeliveryManResponse theMan = new ReadDeliveryManResponse();
            theMan.setId(dM.getId());
            theMan.setName(dM.getName());
            theMan.setShipmentId(dM.getShipmentNumber());
            deliveryMenList.add(theMan);
        }

        response.setDeliveryMen(deliveryMenList);
        return response;
    }

}
