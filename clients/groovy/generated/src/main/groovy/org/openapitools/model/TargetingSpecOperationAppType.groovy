package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.TargetingSpecAppType;
import org.openapitools.model.TargetingSpecListOperation;

@Canonical
class TargetingSpecOperationAppType {

    enum FieldEnum {
    
        APPTYPE("APPTYPE")
    
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
    
    TargetingSpecListOperation operation
    
    List<TargetingSpecAppType> values = new ArrayList<>()
}
