package com.training.microservices.deliverymanservice.controller;

import com.training.microservices.common.deliveryMan.HireDeliveryManRequest;
import com.training.microservices.common.deliveryMan.HireDeliveryManResponse;
import com.training.microservices.common.deliveryMan.ReadDeliveryManListResponse;
import com.training.microservices.common.deliveryMan.ReadDeliveryManResponse;
import com.training.microservices.deliverymanservice.persistence.model.DeliveryMan;
import com.training.microservices.deliverymanservice.service.HireNewDeliveryManIFC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="/api/v1")
public class DeliveryManController {

    @Autowired
    HireNewDeliveryManIFC hireNewDeliveryManIFC;

    public DeliveryManController (HireNewDeliveryManIFC hireNewDeliveryManIFC){
        this.hireNewDeliveryManIFC = hireNewDeliveryManIFC;
    }

    @PostMapping(path="/deliveryMen")
    @ResponseStatus(HttpStatus.CREATED)
    public HireDeliveryManResponse hireDeliveryMan (@RequestBody HireDeliveryManRequest hireDeliveryManRequest) {
       HireDeliveryManResponse response = new HireDeliveryManResponse();
       DeliveryMan createdMan = hireNewDeliveryManIFC.HireNewDeliveryMan(hireDeliveryManRequest);
       response.setId(createdMan.getId());
       return response;
    }

    @GetMapping(path="/deliveryMen/{id}")
    public ResponseEntity<ReadDeliveryManResponse> readDeliveryMan (@PathVariable String id) {
        ReadDeliveryManResponse response;
        //ResponseEntity<ReadDeliveryManResponse> respEntity = new ResponseEntity<ReadDeliveryManResponse>(response, HttpStatus.OK);
        Optional<DeliveryMan> readMan;
        readMan = hireNewDeliveryManIFC.ReadDeliveryMan(id);


        if (readMan.isPresent()) {
            System.out.println("READ THE FOLLOWING ID --> " + readMan.get().getId());
            //Builder Example
            response = ReadDeliveryManResponse.builder()
                    .id(readMan.get().getId())
                    .name(readMan.get().getName())
                    .shipmentId(readMan.get().getShipmentNumber())
                    .build();
            //return new ResponseEntity<ReadDeliveryManResponse>(response, HttpStatus.OK);
            return ResponseEntity.ok().body(response);
            //return respEntity.status(HttpStatus.OK).body(response);
        } else {
            //return new ResponseEntity<ReadDeliveryManResponse>(response, HttpStatus.NOT_FOUND);
            return ResponseEntity.notFound().build();
            //return respEntity.status(HttpStatus.NOT_FOUND).body(response);
        }
    }

    @GetMapping(path="/deliveryMen")
    public ReadDeliveryManListResponse readDeliveryMenList (){
        ReadDeliveryManListResponse response = new ReadDeliveryManListResponse();
        List<ReadDeliveryManResponse> deliveryMenList = new ArrayList<>();
        Iterable<DeliveryMan> readMenList = hireNewDeliveryManIFC.ReadDeliveryMenList();

        for (DeliveryMan dM : readMenList){
            ReadDeliveryManResponse theMan;
            theMan = ReadDeliveryManResponse
                    .builder()
                    .id(dM.getId())
                    .name(dM.getName())
                    .shipmentId(dM.getShipmentNumber())
                    .build();
            deliveryMenList.add(theMan);
        }

        response.setDeliveryMen(deliveryMenList);

        return response;
    }


}
