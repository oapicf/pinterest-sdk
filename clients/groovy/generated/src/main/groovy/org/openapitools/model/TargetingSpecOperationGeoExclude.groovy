package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.TargetingSpecListOperation;

@Canonical
class TargetingSpecOperationGeoExclude {

    enum FieldEnum {
    
        GEO_EXCLUDE("GEO_EXCLUDE")
    
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
    
    List<String> values = new ArrayList<>()
}
