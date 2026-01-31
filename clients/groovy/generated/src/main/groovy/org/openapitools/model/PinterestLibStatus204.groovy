package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class PinterestLibStatus204 {

    enum StatusCodeEnum {
    
        NUMBER_204(new BigDecimal("204"))
    
        private final BigDecimal value
    
        StatusCodeEnum(BigDecimal value) {
            this.value = value
        }
    
        BigDecimal getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    
    StatusCodeEnum statusCode
}
