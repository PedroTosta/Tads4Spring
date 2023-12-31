package com.example.ecommerce.dto;

import com.example.ecommerce.entities.OrderStatus;
import com.example.ecommerce.entities.Order;

import java.time.Instant;

public class OrderDTO {

    private Long id;
    private Instant moment;
    private OrderStatus status;

    public OrderDTO() {
    }

    public OrderDTO(Long id, Instant moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public OrderDTO(Order entity){
        id = entity.getId();
        moment = entity.getMoment();
        status = entity.getStatus();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
