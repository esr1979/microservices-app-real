package com.training.microservices.deliverymanservice.persistence.repository;

import com.training.microservices.deliverymanservice.persistence.model.DeliveryMan;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DeliveryManRepository extends CrudRepository<DeliveryMan, String> {

    Optional<DeliveryMan> findById(String id);

}
