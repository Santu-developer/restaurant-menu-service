package com.restaurant.menuservice.dto;

import lombok.Data;

/**
 * DTO returned by Menu Service APIs.
 * This object is used by other microservices (Order Service) via Feign.
 * We never expose Entity directly.
 */
@Data
public class MenuResponse {

    private Long id;
    private Long restaurantId;
    private String name;
    private String description;
    private Double price;
    private Boolean available;

}