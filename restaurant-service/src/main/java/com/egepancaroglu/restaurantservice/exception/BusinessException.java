package com.egepancaroglu.restaurantservice.exception;

import com.egepancaroglu.restaurantservice.general.BaseErrorMessage;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author egepancaroglu
 */

@RequiredArgsConstructor
@Getter
@Setter
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class BusinessException extends RuntimeException {

    private final BaseErrorMessage baseErrorMessage;

}
