package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.TargetingSpecShoppingRetargeting;

@Canonical
class TargetingSpecOperationShoppingRetargeting {

    enum FieldEnum {
    
        SHOPPING_RETARGETING("SHOPPING_RETARGETING")
    
        private final String value
    
        FieldEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    
    FieldEnum field

    enum OperationEnum {
    
        SET("SET")
    
        private final String value
    
        OperationEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    
    OperationEnum operation
    
    List<TargetingSpecShoppingRetargeting> values = new ArrayList<>()
}
