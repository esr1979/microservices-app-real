package com.training.microservices.deliverymanservice.persistence.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class DeliveryMan {

    @Id
    private String id;


    @Column(nullable = false)
    private String name;

    @Column
    private String shipmentNumber;

    public DeliveryMan(){
        super();
    }

    public DeliveryMan(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShipmentNumber() {
        return shipmentNumber;
    }

    public void setShipmentNumber(String shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeliveryMan)) return false;
        DeliveryMan that = (DeliveryMan) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "DeliveryMan{" +
                "name='" + name + '\'' +
                '}';
    }

}
