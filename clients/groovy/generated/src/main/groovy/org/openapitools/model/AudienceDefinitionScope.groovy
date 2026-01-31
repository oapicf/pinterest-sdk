package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AudienceDefinitionScope {

    enum ScopeEnum {
    
        PARTNER("PARTNER"),
        
        PINTEREST("PINTEREST")
    
        private final String value
    
        ScopeEnum(String value) {
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

    
    ScopeEnum scope
}
