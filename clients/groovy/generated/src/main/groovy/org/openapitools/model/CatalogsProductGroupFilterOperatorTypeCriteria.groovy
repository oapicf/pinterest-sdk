package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class CatalogsProductGroupFilterOperatorTypeCriteria {

    enum FilterOperatorTypeEnum {
    
        IS("IS"),
        
        CONTAINS("CONTAINS")
    
        private final String value
    
        FilterOperatorTypeEnum(String value) {
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

    
    FilterOperatorTypeEnum filterOperatorType = FilterOperatorTypeEnum.IS
    
    Boolean negated = false
    
    List<String> values = new ArrayList<>()
}
