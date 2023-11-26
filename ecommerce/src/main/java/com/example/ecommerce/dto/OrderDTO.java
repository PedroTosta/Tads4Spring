package com.example.ecommerce.dto;

import com.example.ecommerce.entities.OrderStatus;

import java.time.Instant;

public class OrderDTO {

    private Long id;
    private Instant moment;
    private OrderStatus status;

}
