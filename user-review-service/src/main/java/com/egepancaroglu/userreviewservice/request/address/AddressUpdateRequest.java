package com.egepancaroglu.userreviewservice.request.address;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * @author egepancaroglu
 */
public record AddressUpdateRequest(
        @NotNull(message = "Id can't be null or blank !")
        Long id,
        @NotBlank(message = "City can't be null or blank !")
        @Size(min = 2, max = 50)
        String city,
        @NotBlank(message = "State can't be null or blank !")
        @Size(min = 2, max = 50)
        String state,
        @NotBlank(message = "District can't be null or blank !")
        @Size(min = 2, max = 50)
        String district,
        @NotBlank(message = "Street can't be null or blank !")
        @Size(min = 2, max = 50)
        String street,
        @NotBlank(message = "Location can't be null or blank !")
        String location) {
}
