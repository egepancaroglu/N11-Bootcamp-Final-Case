package com.egepancaroglu.restaurantservice.service;

import com.egepancaroglu.restaurantservice.dto.RestaurantDTO;
import com.egepancaroglu.restaurantservice.request.RestaurantSaveRequest;
import com.egepancaroglu.restaurantservice.request.RestaurantUpdateRequest;

import java.util.List;

/**
 * @author egepancaroglu
 */
public interface RestaurantService {

    RestaurantDTO getRestaurantById(String id);

    RestaurantDTO saveRestaurant(RestaurantSaveRequest request);

    List<RestaurantDTO> getRecommendedRestaurantsByUserId(Long userId);

    List<RestaurantDTO> getAllRestaurants();

    RestaurantDTO updateRestaurant(RestaurantUpdateRequest request);

    void deleteRestaurant(String id);

    RestaurantDTO activateRestaurant(String id);

}
