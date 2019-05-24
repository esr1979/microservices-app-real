package com.training.microservices.deliverymanservice.persistence.repository;

import com.training.microservices.deliverymanservice.persistence.model.DeliveryMan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DeliveryManRepository extends CrudRepository<DeliveryMan, String> {

    List<DeliveryMan> findByName(String name);

}
