package com.egepancaroglu.restaurantservice.dto;

/**
 * @author egepancaroglu
 */

public record RestaurantDTO(String id,
                            String name,
                            String location,
                            Double averageScore) {
}
