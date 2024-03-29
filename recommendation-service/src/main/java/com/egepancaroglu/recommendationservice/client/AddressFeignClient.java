package com.egepancaroglu.recommendationservice.client;

import com.egepancaroglu.recommendationservice.dto.AddressDTO;
import com.egepancaroglu.recommendationservice.response.RestResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author egepancaroglu
 */

@FeignClient(name = "USER-REVIEW-SERVICE", url = "http://localhost:8080/api/v1/addresses")
public interface AddressFeignClient {

    @GetMapping("/with-userId/{userId}")
    ResponseEntity<RestResponse<List<AddressDTO>>> getAddressesByUserId(@PathVariable Long userId);

}
