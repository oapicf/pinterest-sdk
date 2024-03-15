package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class BoardUpdate {
    
    String name
    
    String description

    enum PrivacyEnum {
    
        PUBLIC("PUBLIC"),
        
        SECRET("SECRET")
    
        private final String value
    
        PrivacyEnum(String value) {
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

    
    PrivacyEnum privacy
}
