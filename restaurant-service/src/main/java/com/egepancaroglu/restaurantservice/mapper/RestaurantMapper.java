package com.egepancaroglu.restaurantservice.mapper;

import com.egepancaroglu.restaurantservice.dto.RestaurantDTO;
import com.egepancaroglu.restaurantservice.entity.Restaurant;
import com.egepancaroglu.restaurantservice.request.RestaurantSaveRequest;
import com.egepancaroglu.restaurantservice.request.RestaurantUpdateRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import java.util.List;

/**
 * @author egepancaroglu
 */

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RestaurantMapper {

    @Mapping(target = "status", constant = "INACTIVE")
    @Mapping(target = "averageScore", constant = "0.0")
    Restaurant convertSaveRequestToRestaurant(RestaurantSaveRequest request);

    RestaurantDTO convertRestaurantToRestaurantDTO(Restaurant restaurant);

    List<RestaurantDTO> convertRestaurantsToRestaurantDTOs(List<Restaurant> restaurantsList);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "location", source = "location")
    @Mapping(target = "averageScore", source = "averageScore")
    RestaurantDTO convertSolrDocumentRestaurantToRestaurantDTO(String id, String name, String location, Double averageScore);

    void updateRestaurantRequestToRestaurant(@MappingTarget Restaurant restaurant, RestaurantUpdateRequest request);


}
